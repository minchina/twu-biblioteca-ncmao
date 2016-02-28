package com.tw.biblioteca.domain;

import com.tw.biblioteca.enumeration.Option;

public class Menu {

    private Option option;

    public Menu() {
    }

    public Menu(Option option) {
        this.option = option;
    }


    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
