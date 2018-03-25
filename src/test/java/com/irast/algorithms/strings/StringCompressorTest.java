package com.irast.algorithms.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressorTest {
    StringCompressor app;
    @Before
    public void setUp() throws Exception {
        app = new StringCompressor();
    }

    @Test
    public void compress() {
        String input = "aaabcc";
        String expected = "a3b1c2";

        assertEquals(expected, app.compress(input));
    }
}