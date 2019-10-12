package com.merciless.gleaningserver.service;

import java.util.ArrayList;

import com.merciless.gleaningserver.domain.BookMapper;
import com.merciless.gleaningserver.service.thrift.Book;
import com.merciless.gleaningserver.service.thrift.ClientService;
import com.merciless.gleaningserver.service.thrift.Host;

import org.apache.thrift.TException;
import org.springframework.stereotype.Component;

@Component
public class Server implements ClientService.Iface {

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

    public ArrayList<Book> getAllBooks() throws TException {
        return null;
    }

    public Book getBookByName(String title) throws TException {
        return null;
    }

    public ArrayList<Host> getAllhosts() {
        return null;
    }

}
