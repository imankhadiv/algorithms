package com.irast.algorithms.numeric;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GCDTest {

    GCD app;

    @Before
    public void setUp() throws Exception {
        app = new GCD();
    }

    @Test
    public void gcd() {
        int first = 18;
        int second = 9;

        Assert.assertEquals(9, app.gcd(first, second));
    }
}