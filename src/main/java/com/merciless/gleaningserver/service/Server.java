package com.merciless.gleaningserver.service;

import com.merciless.gleaningserver.domain.BookMapper;
import com.merciless.gleaningserver.service.thrift.BooksService;

import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

@Component
public class Server implements BooksService.Iface {

    private final Gleaner gleaner;

    private final BookMapper bookMapper;

    public Server(Gleaner gleaner, BookMapper bookMapper) {

        this.gleaner = gleaner;
        this.bookMapper = bookMapper;
    }

    @Override
    public boolean addBook(String title, String content) throws TException {

        bookMapper.addBook(title, content);
        
        return true;
    }


}
