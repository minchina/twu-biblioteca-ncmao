package com.tw.biblioteca.domain;

import com.tw.biblioteca.enumeration.Option;

import java.util.List;

import static com.tw.biblioteca.enumeration.Option.LIST_BOOKS;

public class Menu {

    private Option currentOption = LIST_BOOKS;
    private List<Option> options;

    public Menu() {
    }

    public Menu(Option currentOption, List<Option> options) {
        this.currentOption = currentOption;
        this.options = options;
    }

    public Option getCurrentOption() {
        return currentOption;
    }

    public void setCurrentOption(Option currentOption) {
        this.currentOption = currentOption;
    }
}
