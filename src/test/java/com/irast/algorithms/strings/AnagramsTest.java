package com.irast.algorithms.strings;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AnagramsTest {

    Anagrams app;

    @Before
    public void setUp() throws Exception {
        app = new Anagrams();
    }

    @Test
    public void sortBasedOnAnagrams() {

        List<String> list = Arrays.asList("abc", "dd", "bac", "ad", "z", "cba");
        List<String> expected = Arrays.asList("abc", "bac", "cba", "ad", "dd", "z");

        assertThat(app.sortBasedOnAnagrams(list), is(expected));

    }

    @Test
    @Ignore
    public void sortBaseOnAnagrams2() {

    }

    @Test
    public void sortBasedOnAnagrams3() {
        List<String> list = Arrays.asList("abc", "dd", "bac", "ad", "z", "cba");
        List<String> expected = Arrays.asList("abc", "bac", "cba", "dd", "ad", "z");

        assertThat(app.sortBaseOnAnagrams3(list), is(expected));

    }
}