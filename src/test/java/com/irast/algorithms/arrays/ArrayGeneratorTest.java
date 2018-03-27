package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ArrayGeneratorTest {
    ArrayGenerator app;

    @Before
    public void setUp() throws Exception {
        app = new ArrayGenerator();
    }

    @Test
    public void generateOddNumberFromRangeWhenStartAndEndAreEven() {
        int[] expected = {3, 5, 7};
        Assert.assertArrayEquals(expected, app.generateOddNumberFromRange(2, 8));
    }

    @Test
    public void generateOddNumberFromRangeWhenStartAndEndAreOdd() {
        int[] expected = {3, 5, 7};
        Assert.assertArrayEquals(expected, app.generateOddNumberFromRange(3, 7));
    }

    @Test
    public void generateOddNumberFromRangeWhenStartOrEndAreOdd() {
        int[] expected = {3, 5, 7};
        Assert.assertArrayEquals(expected, app.generateOddNumberFromRange(3, 8));
    }

    @Test
    public void generateOddNumberFromRangeWhenStartOrEndAreOdd2() {
        int[] expected = {3};
        Assert.assertArrayEquals(expected, app.generateOddNumberFromRange(3, 4));
    }
}