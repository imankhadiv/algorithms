package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSearchTest {
    MatrixSearch app;
    @Before
    public void setUp() throws Exception {
        app = new MatrixSearch();
    }

    @Test
    public void shouldFindItem() {
        int[][] input = {{1,10,100},{2,11,101},{4,20,200}};
        int item = 100;
        assertTrue(app.findItem(input,item));
    }
    @Test
    public void shouldNotFindItem() {
        int[][] input = {{1,10,100},{2,11,101},{4,20,200}};
        int item = 102;
        assertFalse(app.findItem(input,item));
    }
}