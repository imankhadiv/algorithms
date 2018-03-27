package com.irast.algorithms.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxSubStringTest {
    MaxSubString app;

    @Before
    public void setUp() throws Exception {
        app = new MaxSubString();
    }

    @Test
    public void findMaxSubStringWithNoDuplicate() {

        String input = "abcd";
        String expected = "abcd";

        Assert.assertEquals(expected, app.findMaxSubStringWithNoDuplicate(input));
    }

    @Test
    public void findMaxSubStrinqWithNoDuplicate() {

        String input = "aabbcd";
        String expected = "bcd";

        Assert.assertEquals(expected, app.findMaxSubStringWithNoDuplicate(input));
    }

    @Test
    public void findMaxSubStrinqLengthWithNoDuplicate() {

        String input = "aabbcd";
        int expected = 3;

        Assert.assertEquals(expected, app.findMaxSubStringLengthWithNoDuplicate(input));
    }
    @Test
    public void findMaxSubStrinqLengthWithNoDuplicateUsingMap() {

        String input = "aabbcd";
        int expected = 3;

        Assert.assertEquals(expected, app.findMaxSubStringLengthWithNoDuplicateUsingMap(input));
    }
}