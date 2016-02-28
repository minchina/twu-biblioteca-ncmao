package com.tw.biblioteca.repository;

import com.tw.biblioteca.domain.Book;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public static List<Book> ALL_BOOKS = Arrays.asList(
            new Book("Head First Java", "Sierra", "2007"), new Book());

    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }
}
