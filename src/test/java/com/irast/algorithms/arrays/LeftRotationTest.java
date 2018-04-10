package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeftRotationTest {

    LeftRotation app;

    @Before
    public void setUp() throws Exception {
        app = new LeftRotation();
    }

    @Test
    public void rotateToLeft() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = {2, 3, 4, 5, 1};
        Assert.assertArrayEquals(result, app.rotateToLeft(input, 1));
    }

    @Test
    public void rotateTwiceToLeftWith() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};

        Assert.assertArrayEquals(expected, app.rotateToLeft(input, 2));
    }

    @Test
    public void shouldNotRotate() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expected, app.rotateToLeft(input, 5));
    }

    @Test
    public void shouldNotRotateWhenNIsZero() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(expected, app.rotateToLeft(input, 0));
    }
}