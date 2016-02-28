package com.tw.biblioteca.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    public void shouldPrintCheckOutSuccess(){
        BookService bookService = new BookService();

        bookService.checkOutByName("Head First Java");

        assertEquals("===========Thank you! Enjoy the book===========\n", outContent.toString());
    }
}
