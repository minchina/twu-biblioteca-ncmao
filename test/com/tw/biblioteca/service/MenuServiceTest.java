package com.tw.biblioteca.service;

import org.junit.Test;

import static com.tw.biblioteca.enumeration.Option.INVALID;
import static com.tw.biblioteca.enumeration.Option.LIST_BOOKS;
import static com.tw.biblioteca.enumeration.Option.QUIT;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MenuServiceTest {

    @Test
    public void shouldTipsErrorIfChoseAInvalidOption(){
        MenuService menuService = new MenuService();
        String select = menuService.choose(INVALID);

        assertThat(select, is("choose a valid option!"));
    }

    @Test
    public void shouldPrintSuccessIfChoseListBooks(){
        MenuService menuService = new MenuService();
        String choose = menuService.choose(LIST_BOOKS);

        assertThat(choose, is("list success"));
    }

    @Test
    public void shouldTipsQuitIfChoseQuit(){
        MenuService menuService = new MenuService();
        menuService.choose(QUIT);

        String choose = menuService.choose(LIST_BOOKS);
        assertThat(choose, is("you have quit!"));
    }
}
