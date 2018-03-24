package com.irast.algorithms;

import com.irast.algorithms.numeric.Fibonacci;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    Fibonacci app;

    @Before
    public void setUp() throws Exception {
        app = new Fibonacci();
    }

    @Test
    public void findFibonacci() {

        long result = 10946;
        Assert.assertEquals(result, app.findFibonacci(20));
    }

    @Test
    public void findFibonacciWithParameter() {

        long result = 10946;
        Assert.assertEquals(result, app.findFibonacciWithParameter(20));
    }
}