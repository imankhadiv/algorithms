package com.irast.algorithms.numeric;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {

    PrimeNumber app;

    @Before
    public void setUp() throws Exception {
        app = new PrimeNumber();
    }

    @Test
    public void isPrimeNumber() {

        assertTrue(app.isPrimeNumber(13));
        assertTrue(app.isPrimeNumber(17));
        assertTrue(app.isPrimeNumber(1));
        assertFalse(app.isPrimeNumber(10));
        assertFalse(app.isPrimeNumber(15));

    }
}