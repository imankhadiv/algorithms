package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxDiffTest {

    MaxDiff app;

    @Before
    public void setUp() throws Exception {
        app = new MaxDiff();
    }

    @Test
    public void maxDifference() {

        int[] input = {1, 2, 6, 4};
        int expected = 6 - 1;
        Assert.assertEquals(expected, app.maxDifferenceBetweenElements(input));
    }

    @Test
    public void shouldGetMaxDiffWhenInputIsSorted() {

        int[] input = {1, 2, 6, 10};
        int expected = 10 - 1;
        Assert.assertEquals(expected, app.maxDifferenceBetweenElements(input));
    }

    @Test
    public void shouldGetMinusOneWhenInputIsSortedInReverse() {

        int[] input = {10, 8, 6, 4};
        int expected = -1;
        Assert.assertEquals(expected, app.maxDifferenceBetweenElements(input));
    }

    @Test
    public void shouldGetMinusOneWhenInputIsSortedInReverse2() {

        int[] input1 = {5, 10, 8, 7, 6, 5};
        int[] input2 = {5, 10, 8, 7, 6, 5};
        int expected = 5;
        //Assert.assertEquals(expected, app.maxDifferenceBetweenElements(input1));
        Assert.assertEquals(expected, app.maxDifferenceN2(input2));
        Assert.assertEquals(expected, app.maxDifferenceN(input2));
        Assert.assertEquals(expected, app.maxDifferenceNSpaceN(input2));
    }

    @Test
    public void shouldGetMinusOneWhenInputHasDuplicate() {

        int[] input1 = {7, 2, 3, 10, 2, 4, 8, 1};
        int[] input2 = {7, 2, 3, 10, 2, 4, 8, 1};
        int expected = 10 - 2;
        Assert.assertEquals(expected, app.maxDifferenceBetweenElements(input1));
        Assert.assertEquals(expected, app.maxDifferenceN2(input2));
        Assert.assertEquals(expected, app.maxDifferenceN(input2));
        Assert.assertEquals(expected, app.maxDifferenceNSpaceN(input2));

    }
}