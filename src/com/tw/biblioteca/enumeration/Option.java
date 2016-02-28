package com.tw.biblioteca.enumeration;

public enum Option {

    LIST_BOOKS("List Books", "success"),
    INVALID("", "Select a valid option!");

    private String command;
    private String description;

    Option(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
