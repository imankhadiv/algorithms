package com.irast.algorithms.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RightRotationTest {

    RightRotation app;

    @Before
    public void setUp() throws Exception {
        app = new RightRotation();
    }

    @Test
    public void rotate() {

        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(result, app.rotate(input, 3));

    }
    @Test
    public void shouldNotRotate() {

        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(result, app.rotate(input, 0));

    }
    @Test
    public void shouldBeEqualWithKEqulasToSize() {

        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        
        Assert.assertArrayEquals(result, app.rotate(input, 7));

    }
}