package com.tw.biblioteca.service;

import com.tw.biblioteca.domain.Book;
import com.tw.biblioteca.enumeration.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.tw.biblioteca.enumeration.Status.CHECK_OUT;
import static org.junit.Assert.assertEquals;

public class ConsoleServiceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void shouldPrintWelcome(){
        ConsoleService.printWelcome();
        assertEquals("===============Welcome to Biblioteca!===============\n", outContent.toString());
    }


    @Test
    public void shouldDisplayNotAvailableMessage(){
        BookService bookService = new BookService();
        Book book = bookService.findBookByName("Head First Java");
        book.setStatus(Status.UNAVAILABLE);

        bookService.checkOutByName("Head First Java");

        assertEquals("===========That book is not available.=========\n", outContent.toString());

    }

    @Test
    public void shouldPrintCheckOutSuccess(){
        BookService bookService = new BookService();

        bookService.checkOutByName("Head First Java");

        assertEquals("===========Thank you! Enjoy the book===========\n", outContent.toString());
    }

    @Test
    public void shouldDisplayIfBookIsReturn(){

        BookService bookService = new BookService();
        bookService.findBookByName("Head First Java").setStatus(CHECK_OUT);

        bookService.returnBook("Head First Java");

        assertEquals("===========Thank you for returning the book.===========\n", outContent.toString());

    }
    @Test
    public void shouldTipsValidBookToReturn(){

        BookService bookService = new BookService();
        bookService.findBookByName("Head First Java").setStatus(CHECK_OUT);

        bookService.returnBook("Head First java");

        assertEquals("===========That is not a valid book to return.===========\n", outContent.toString());

    }
}
