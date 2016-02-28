package com.tw.biblioteca.service;

public class ConsoleService {

    public static void printWelcome(){
        System.out.println("===============Welcome to Biblioteca!===============");
        }

    public static void printCheckOutSuccess(){
        System.out.println("===========Thank you! Enjoy the book===========");
    }

    public static void printNotAvailableMessage() {
        System.out.println("===========That book is not available.=========");
    }

    public static void printSuccessReturn(){
        System.out.println("===========Thank you for returning the book.===========");
    }

    public static void printUnsuccessfulReturn(){
        System.out.println("===========That is not a valid book to return.===========");
    }
}
