package com.tw.biblioteca.domain;

import com.tw.biblioteca.enumeration.Status;

import static com.tw.biblioteca.enumeration.Status.AVAILABLE;

public class Book {

    private Long id;
    private String name;
    private String author;
    private String publishedYear;
    private Status status = AVAILABLE;

    public Book() {
    }

    public Book(String name, String author, String publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
