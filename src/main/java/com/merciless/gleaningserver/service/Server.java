package com.merciless.gleaningserver.service;

import java.util.ArrayList;

import com.merciless.gleaningserver.domain.BookMapper;
import com.merciless.gleaningserver.domain.HostMapper;
import com.merciless.gleaningserver.service.thrift.Book;
import com.merciless.gleaningserver.service.thrift.ClientService;
import com.merciless.gleaningserver.service.thrift.Host;

import org.apache.thrift.TException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Server implements ClientService.Iface {

    private final Gleaner gleaner;

    private final BookMapper bookMapper;

    private final HostMapper hostMapper;

    public Server(Gleaner gleaner, BookMapper bookMapper, HostMapper hostMapper) {

        this.gleaner = gleaner;
        this.bookMapper = bookMapper;
        this.hostMapper = hostMapper;
    }

    @Override
    public boolean addBook(String title, String content) throws TException {

        bookMapper.addBook(title, content);
        
        return true;
    }

    public ArrayList<Book> getAllBooks() throws TException {
        return bookMapper.getAllBooks();
    }

    public Book getBookByName(String title) throws TException {

        Book book;

        try {
            book = bookMapper.findByTitle(title);
        } catch(DataAccessException e) {

            log.info(String.format("Book %s handled to other servers...", title));
            return this.gleaner.glean(title);

        }
        return book;
    }

    public ArrayList<Host> getAllhosts() {

        return hostMapper.getAllHosts();
    }

}
