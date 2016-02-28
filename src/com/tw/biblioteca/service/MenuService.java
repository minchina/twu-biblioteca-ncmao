package com.tw.biblioteca.service;

import com.tw.biblioteca.domain.Menu;
import com.tw.biblioteca.enumeration.Option;

import java.util.Arrays;

import static com.tw.biblioteca.enumeration.Option.*;
import static com.tw.biblioteca.enumeration.Option.LIST_BOOKS;

public class MenuService {

    private static Menu MENU = new Menu(LIST_BOOKS, Arrays.asList(LIST_BOOKS, QUIT, INVALID));

    public String choose(Option option) {
        if (isApplyNewOption(option)) {
            getMenu().setCurrentOption(option);
        }
        return getMenu().getCurrentOption().getDescription();
    }

    public Menu getMenu(){
        return MENU;
    }

    private boolean isApplyNewOption(Option option){
        return !QUIT.equals(getMenu().getCurrentOption());
    }
}
