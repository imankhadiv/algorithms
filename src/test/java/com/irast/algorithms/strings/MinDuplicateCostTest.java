package com.irast.algorithms.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinDuplicateCostTest {

    MinDuplicateCost app;
    @Before
    public void setUp() throws Exception {
        app = new MinDuplicateCost();
    }

    @Test
    public void shouldFindTheMinCostForMakingInputsTheSame() {
        String s1 = "abcd";
        String s2 = "acdb";
        int costS1 = 10;
        int costS2 = 20;

        assertEquals(30, app.findMinCostForMakingStringsTheSame(s1,s2, costS1, costS2));
    }
}