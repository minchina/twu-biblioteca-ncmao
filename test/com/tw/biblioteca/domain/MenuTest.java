package com.tw.biblioteca.domain;

import com.tw.biblioteca.enumeration.Option;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MenuTest {


    @Test
    public void shouldChoseOptionToListAllBooks() {
        Menu menu = new Menu();
        menu.setOption(Option.LIST_BOOKS);

        assertThat(menu.getOption().getCommand(), is("List Books"));
        assertThat(menu.getOption(), is(Option.LIST_BOOKS));
    }
}
