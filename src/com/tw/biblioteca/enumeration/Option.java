package com.tw.biblioteca.enumeration;

public enum Option {

    LIST_BOOKS("List Books");

    private String command;

    Option(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
