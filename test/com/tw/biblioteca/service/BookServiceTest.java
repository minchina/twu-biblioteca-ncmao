package com.tw.biblioteca.service;

import com.tw.biblioteca.domain.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.tw.biblioteca.enumeration.Status.CHECK_OUT;
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
        assertThat(allBooks.size(), is(3));
    }

    @Test
    public void shouldNotDisplayIfBookIsCheckout(){

        List<Book> allBooks = bookService.getAllBooks();
        assertThat(allBooks.size(), is(3));

        bookService.checkOutByName("Head First Java");
        List<Book> allBooksExcludeCheckOut = bookService.getAllBooksExcludeCheckOut();

        assertThat(allBooksExcludeCheckOut.size(), is(2));
    }

    @Test
    public void shouldDisplayIfBookIsReturn(){

        Book book = bookService.findBookByName("Head First Java");
        bookService.checkOutByName(book.getName());

        assertThat(bookService.getAllBooksExcludeCheckOut().size(), is(2));

        bookService.returnBook("Head First Java");

        assertThat(bookService.getAllBooksExcludeCheckOut().size(), is(3));

    }

    @Test
    public void shouldNotReturnIfBookIsExist(){

        bookService.findBookByName("Head First Java").setStatus(CHECK_OUT);

        assertThat(bookService.getAllBooksExcludeCheckOut().size(), is(2));

        bookService.returnBook("Head First java");

        assertThat(bookService.getAllBooksExcludeCheckOut().size(), is(2));

    }
}
