package com.irast.algorithms.arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchWordTest {

    BinarySearchWord app;

    @Before
    public void setUp() throws Exception {
        app = new BinarySearchWord();
    }

    @Test
    public void shouldNotFind() {
        String[] input = {"ab", "ac", "b", "c", "f"};
        String word = "bb";

        assertEquals(-1, app.search(input, word));
    }

    @Test
    public void shouldFind() {
        String[] input = {"ab", "ac", "b", "c", "f"};
        String word = "ac";

        assertEquals(1, app.search(input, word));
    }

    @Test
    public void shouldFind2() {
        String[] input = {"ab", "ac", "b", "c", "f"};
        String word = "f";

        assertEquals(4, app.search(input, word));
    }

    @Test
    public void shouldFindWithEmptyString() {
        String[] input = {"ab", "ac", "b", "", "c", "", "", "", "f"};
        String word = "f";

        assertEquals(8, app.search(input, word));
    }

    @Test
    public void shouldFindWithEmptyString2() {
        String[] input = {"ab", "", "ac"};
        String word = "ab";

        assertEquals(0, app.search(input, word));

    }
}