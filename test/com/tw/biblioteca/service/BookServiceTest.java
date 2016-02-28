package com.tw.biblioteca.service;

import com.tw.biblioteca.domain.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookServiceTest {
    private BookService bookService;

    @Before
    public void setUp(){
        bookService = new BookService();
    }

    @Test
    public void shouldGetAllBook(){
        List<Book> allBooks = bookService.getAllBooks();
        assertThat(allBooks.size(), is(2));
    }
}
