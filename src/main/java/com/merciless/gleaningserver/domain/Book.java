package com.merciless.gleaningserver.domain;

public class Book {

    private long bookId;

    private String title;

    private String content;

    public long getBookId() {
        return bookId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}