package com.merciless.gleaningserver.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

import java.util.ArrayList;

import com.merciless.gleaningserver.service.thrift.Book;

@Mapper
public interface BookMapper {
    
    @Insert("INSERT INTO books(title, content) VALUES (#{title}, #{content})")
    void addBook(@Param("title") String title, @Param("content") String content);

    @Select("SELECT * FROM books WHERE title=#{title}")
    Book findByTitle(@Param("title") String title) throws DataAccessException;

    @Select("SELECT * FROM books")
    ArrayList<Book> getAllBooks() throws DataAccessException;
}
