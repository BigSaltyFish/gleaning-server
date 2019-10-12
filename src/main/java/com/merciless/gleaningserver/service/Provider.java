package com.merciless.gleaningserver.service;

import com.merciless.gleaningserver.domain.BookMapper;
import com.merciless.gleaningserver.service.thrift.Book;
import com.merciless.gleaningserver.service.thrift.ServerCommunication;

import org.apache.thrift.TException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Provider implements ServerCommunication.Iface {

    private final BookMapper bookMapper;

    public Provider(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book gleanBook(String title) throws TException {

        log.info(String.format("incoming glean request for book %s...", title));
        Book book;

        try {

            book = bookMapper.findByTitle(title);
            log.info(String.format("book %s found", title));
        } catch (DataAccessException e) {
            log.info(String.format("book %s not found", title));
            book = null;
        }

        return book;
    }

}
