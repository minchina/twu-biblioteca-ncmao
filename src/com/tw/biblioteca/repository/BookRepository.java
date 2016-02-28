package com.tw.biblioteca.repository;

import com.tw.biblioteca.domain.Book;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public static List<Book> ALL_BOOKS = Arrays.asList(
            new Book("Head First Java", "Sierra", "2007"), new Book("thinking in java", "Bruce Eckel", "2007"));

    public List<Book> getAllBooks() {
        return ALL_BOOKS;
    }
}
