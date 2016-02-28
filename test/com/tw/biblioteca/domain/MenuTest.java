package com.tw.biblioteca.domain;

import com.tw.biblioteca.enumeration.Option;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MenuTest {


    @Test
    public void shouldChoseOptionToListAllBooks() {
        Menu menu = new Menu();
        menu.setCurrentOption(Option.LIST_BOOKS);

        assertThat(menu.getCurrentOption().getCommand(), is("List Books"));
        assertThat(menu.getCurrentOption(), is(Option.LIST_BOOKS));
    }

    @Test
    public void shouldTipsErrorIfOptionIsValid(){
        Menu menu = new Menu();
        menu.setCurrentOption(Option.INVALID);

        assertThat(menu.getCurrentOption().getCommand(), is(""));
        assertThat(menu.getCurrentOption(), is(Option.INVALID));
        assertThat(menu.getCurrentOption().getDescription(), is("choose a valid option!"));
    }

    @Test
    public void shouldQuitWhenCustomerChoseQuitOption(){
        Menu menu = new Menu();
        menu.setCurrentOption(Option.QUIT);

        assertThat(menu.getCurrentOption().getCommand(), is("Quit"));
        assertThat(menu.getCurrentOption(), is(Option.QUIT));
        assertThat(menu.getCurrentOption().getDescription(), is("you have quit!"));
    }
}
