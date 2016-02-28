package com.tw.biblioteca.service;

import com.tw.biblioteca.domain.Book;
import com.tw.biblioteca.repository.BookRepository;

import java.util.List;

public class BookService {
    private BookRepository bookRepository = new BookRepository();

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}
