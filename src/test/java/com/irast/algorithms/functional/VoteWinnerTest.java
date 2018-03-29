package com.irast.algorithms.functional;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class VoteWinnerTest {

    VoteWinner app;

    @BeforeEach
    void setUp() {
        app = new VoteWinner();
    }

    @Test
    void findTheWinner() {

        Map<String, Integer> map = new HashMap<>();
        map.put("Z", 10);
        map.put("D", 5);
        map.put("A", 5);
        map.put("ZZD", 40);
        map.put("ZZA", 40);
        map.put("X", 5);
        map.put("BZ", 40);
        map.put("BB", 20);

        Map<String, Integer> result = app.findTheWinner(map);
        Assert.assertThat(result, Matchers.hasKey("ZZD"));
        Assert.assertThat(result, Matchers.hasValue(40));
    }


    @Test
    void findTheWinnerByTreeSet() {

        Map<String, Integer> map = new HashMap<>();
        map.put("Z", 10);
        map.put("D", 5);
        map.put("A", 5);
        map.put("ZZA", 40);
        map.put("ZZD", 40);
        map.put("X", 5);
        map.put("BZ", 40);
        map.put("BB", 20);

        Map.Entry<String, Integer> result = app.findTheWinnerWithoutFunctional(map);
        Assert.assertEquals("ZZD", result.getKey());
        Assert.assertEquals(40, result.getValue().intValue());

    }
}