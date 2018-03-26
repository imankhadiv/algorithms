package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    Stock app;
    @Before
    public void setUp() throws Exception {
        app = new Stock();
    }

    @Test
    public void findMax() {

        int[] prices = {100,180,260,310,40,535,695};
        Assert.assertEquals((695-40), app.findMax(prices));
    }

    @Test
    public void findMax2() {

        int[] prices = {100,180,260,310,40,535,500};
        Assert.assertEquals((535-40), app.findMax(prices));
    }
    @Test
    public void findMax3() {

        int[] prices = {150,100,180,300};
        Assert.assertEquals((300-100), app.findMax(prices));
    }
}