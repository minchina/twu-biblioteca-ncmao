package com.tw.biblioteca.service;

import com.tw.biblioteca.domain.Book;
import com.tw.biblioteca.enumeration.Status;
import com.tw.biblioteca.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

import static com.tw.biblioteca.enumeration.Status.AVAILABLE;
import static com.tw.biblioteca.enumeration.Status.CHECK_OUT;
import static com.tw.biblioteca.enumeration.Status.UNAVAILABLE;

public class BookService {
    private BookRepository bookRepository = new BookRepository();

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public List<Book> getAllBooksExcludeCheckOut(){
        List<Book> allBooks = bookRepository.getAllBooks();
        List<Book> books = new ArrayList<>();
        for (Book book : allBooks) {
            if (!CHECK_OUT.equals(book.getStatus())) {
                books.add(book);
            }
        }
        return books;

    }

    public Book findBookByName(String name) {
        return bookRepository.findBookByName(name);
    }

    public void checkOutByName(String name) {
        Book book = findBookByName(name);
        if (AVAILABLE.equals(book.getStatus())) {
            book.setStatus(CHECK_OUT);
            ConsoleService.printCheckOutSuccess();
        }

        if (UNAVAILABLE.equals(book.getStatus())) {
            ConsoleService.printNotAvailableMessage();
        }

    }

    public void returnBook(String name) {
        Book book = findBookByName(name);
        if (Status.CHECK_OUT.equals(book.getStatus())) {
            book.setStatus(AVAILABLE);
        }
    }
}
