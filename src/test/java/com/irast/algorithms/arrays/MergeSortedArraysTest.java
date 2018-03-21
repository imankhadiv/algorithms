package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MergeSortedArraysTest {
    MergeSortedArrays app;

    @Before
    public void setUp() {
        app = new MergeSortedArrays();
    }

    @Test
    public void shouldMergeTwoSortedArray() {

        int[] first = {10, 30, 50};
        int[] second = {2, 4, 6, 8};
        int[] result = {2, 4, 6, 8, 10, 30, 50};

        Assert.assertArrayEquals(result, app.mergeSortedArrays(first, second));

    }
}