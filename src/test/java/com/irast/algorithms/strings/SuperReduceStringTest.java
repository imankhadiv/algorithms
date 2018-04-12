package com.irast.algorithms.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperReduceStringTest {

    SuperReduceString app;

    @Before
    public void setUp() throws Exception {
        app = new SuperReduceString();
    }

    @Test
    public void reduce() {
        String input = "baab";
        String expected = "Empty String";

        Assert.assertEquals(expected, app.reduce(input));
    }
    @Test
    public void reduceWhenSomeWordsRemain() {
        String input = "baaab";
        String expected = "bab";

        Assert.assertEquals(expected, app.reduce(input));
    }
}