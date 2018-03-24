package com.irast.algorithms.numeric;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryConversionTest {

    BinaryConversion app;

    @Before
    public void setUp() throws Exception {
        app = new BinaryConversion();
    }

    @Test
    public void convertToBinary() {

        String result = "101";
        assertEquals(result, app.convertToBinary(5));
    }

    @Test
    public void convertToBinaryRecursively() {

        String result = "101";
        assertEquals(result, app.convertToBinaryRecursively(5));
    }

    @Test
    public void convertToBinaryRecursively2() {

        String result = "1";
        assertEquals(result, app.convertToBinaryRecursively(1));
    }
}