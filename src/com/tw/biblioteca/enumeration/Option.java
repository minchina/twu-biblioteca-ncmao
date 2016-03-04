package com.tw.biblioteca.enumeration;

public enum Option {

    LIST_BOOKS("List Books", "list success"),
    INVALID("", "choose a valid option!"),
    QUIT("Quit", "you have quit!");

    private String command;
    private String description;

    Option(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }


    public String getDescription() {
        return description;
    }

}
