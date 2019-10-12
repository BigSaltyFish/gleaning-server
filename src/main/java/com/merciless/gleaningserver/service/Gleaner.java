package com.merciless.gleaningserver.service;

import java.util.ArrayList;

import com.merciless.gleaningserver.configuration.Config;
import com.merciless.gleaningserver.domain.HostMapper;
import com.merciless.gleaningserver.service.thrift.Book;
import com.merciless.gleaningserver.service.thrift.Host;
import com.merciless.gleaningserver.service.thrift.ServerCommunication;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Gleaner {

    private HostMapper hostMapper;

    private Config config;

    public Gleaner(HostMapper hostMapper, Config config) {

        this.hostMapper = hostMapper;
        this.config = config;
    }
    
    public Book glean(String title) {

        ArrayList<Host> hosts = hostMapper.getAllHosts();
        Book book = null;

        for(Host host : hosts) {

            log.info(String.format("Started to ask server %s", host.getHostName()));

            try {
                TTransport transport;
                transport = new TSocket(host.getLocation(), config.GLEANER_PORT);
                transport.open();

                TProtocol protocol = new TBinaryProtocol(transport);
                ServerCommunication.Client client = new ServerCommunication.Client(protocol);

                book = client.gleanBook(title);
                log.info("Response arrived. ");

                transport.close();
            } catch (TException e) {
                log.error(String.format("Error while gleaning from %s for %s", host, title));
            }
            
            if(book != null) {
                log.info(String.format("Book %s successfully found in server %s", title, host));
                break;
            }
        }

        if(book == null) log.error(String.format("No book named %s found", title));

        return book;
    }
}
