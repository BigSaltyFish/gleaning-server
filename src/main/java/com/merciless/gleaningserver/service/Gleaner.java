package com.merciless.gleaningserver.service;

import java.util.ArrayList;

import com.merciless.gleaningserver.domain.HostMapper;
import com.merciless.gleaningserver.service.thrift.Book;
import com.merciless.gleaningserver.service.thrift.Host;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Gleaner {

    private HostMapper hostMapper;

    public Gleaner(HostMapper hostMapper) {

        this.hostMapper = hostMapper;
    }
    
    public Book glean(String title) {

        ArrayList<Host> hosts = hostMapper.getAllHosts();

        for(Host host : hosts) {

            log.info(String.format("Started to ask server %s", host.getHostName()));

        }

        return null;
    }
}
