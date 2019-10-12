package com.merciless.gleaningserver.service;

import java.util.ArrayList;

import com.merciless.gleaningserver.domain.HostMapper;
import com.merciless.gleaningserver.service.thrift.Book;
import com.merciless.gleaningserver.service.thrift.Host;

import org.springframework.stereotype.Component;

@Component
public class Gleaner {

    private HostMapper hostMapper;
    
    public Book glean(title) {

        ArrayList<Host> hosts = hostMapper.getAllHosts();
        return null;
    }
}
