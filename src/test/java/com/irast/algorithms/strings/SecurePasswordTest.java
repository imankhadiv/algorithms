package com.irast.algorithms.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecurePasswordTest {

    SecurePassword app;

    @Before
    public void setUp() throws Exception {
        app = new SecurePassword();
    }

    @Test
    public void minimumNumber() {
        String input = "#HackerRank";
        int expected = 1;
        Assert.assertEquals(expected, app.minimumNumber(input));

    }
}