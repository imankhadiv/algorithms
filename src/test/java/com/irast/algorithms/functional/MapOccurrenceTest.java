package com.irast.algorithms.functional;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasValue;

class MapOccurrenceTest {

    MapOccurrence app;
    int[] input;

    @BeforeEach
    void setUp() {
        app = new MapOccurrence();
        input = new int[]{1, 10, 2, 2, 2, 0, 4};
    }

    @Test
    void convertArrayToMapUsingMappingCollectors() {

        Map<Integer, Integer> map = app.convertArrayToMapUsingMappingCollectors(input);


        Assert.assertEquals(5, map.size());
        assertThat(map, hasKey(1));
        assertThat(map, hasKey(2));
        assertThat(map, hasValue(3));
        assertThat(map, hasValue(1));
    }

    @Test
    void convertArrayToMapUsingGroupingCollectors() {
        Map<Integer, Integer> map = app.convertArrayToMapUsingGroupingCollectors(input);


        Assert.assertEquals(5, map.size());
        assertThat(map, hasKey(1));
        assertThat(map, hasKey(2));
        assertThat(map, hasValue(3));
        assertThat(map, hasValue(1));
    }

    @Test
    void convertArrayToMapUsingMerging() {
        Map<Integer, Integer> map = app.convertArrayToMapUsingMerging(input);


        Assert.assertEquals(5, map.size());
        assertThat(map, hasKey(1));
        assertThat(map, hasKey(2));
        assertThat(map, hasValue(3));
        assertThat(map, hasValue(1));
    }

    @Test
    void convertArrayToMapUsingComputing() {

        Map<Integer, Integer> map = app.convertArrayToMapUsingComputing(input);

        Assert.assertEquals(5, map.size());
        assertThat(map, hasKey(1));
        assertThat(map, hasKey(2));
        assertThat(map, hasValue(3));
        assertThat(map, hasValue(1));

    }
}