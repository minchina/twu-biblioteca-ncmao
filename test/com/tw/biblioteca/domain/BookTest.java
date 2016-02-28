package com.tw.biblioteca.domain;

import com.tw.biblioteca.service.BookService;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void shouldGetBookDetails(){
        Book book = new Book();
        book.setName("Head First Java");
        book.setAuthor("Sierra");
        book.setPublishedYear("2007");

        assertThat(book.getName(), is("Head First Java"));
        assertThat(book.getAuthor(), is("Sierra"));
        assertThat(book.getPublishedYear(), is("2007"));
    }

    @Test
    public void shouldGetBookDetailsFromService(){
        BookService bookService = new BookService();
        List<Book> allBooks = bookService.getAllBooks();

        assertThat(allBooks.get(0).getName(), is("Head First Java"));
        assertThat(allBooks.get(0).getAuthor(), is("Sierra"));
        assertThat(allBooks.get(0).getPublishedYear(), is("2007"));
    }
}
