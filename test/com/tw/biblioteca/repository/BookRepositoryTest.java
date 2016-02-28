package com.tw.biblioteca.repository;

import com.tw.biblioteca.domain.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookRepositoryTest {
    private BookRepository bookRepository;


    @Before
    public void setUp(){
        bookRepository = new BookRepository();
    }
    @Test
    public void shouldGetAllBooks() {
        List<Book> books = bookRepository.getAllBooks();
        assertThat(books.size(), is(3));
    }
}
