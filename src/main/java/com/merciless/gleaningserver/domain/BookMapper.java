package com.merciless.gleaningserver.domain;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    
    @Insert("INSERT INTO books(title, content) VALUES (#{title}, #{content})")
    void addBook(@Param("title") String title, @Param("content") String content);

    @Select("SELECT * FROM books WHERE bookId=#{bookId}")
    Book findById(@Param("bookId") long bookId);

    @Select("SELECT * FROM books WHERE title=#{title}")
    ArrayList<Book> findByTitle(@Param("title") String title);
}
