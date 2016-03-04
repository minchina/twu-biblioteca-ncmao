package com.tw.biblioteca.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

    @Test
    public void shouldGetMovieNameDirectorAndRate(){
        Movie movie = new Movie();
        movie.setName("haha");
        movie.setDirector("mike");
        movie.setRating(9);

        assertThat(movie.getName(), is("haha"));
        assertThat(movie.getDirector(), is("mike"));
        assertThat(movie.getRating(), is(9));
    }
}
