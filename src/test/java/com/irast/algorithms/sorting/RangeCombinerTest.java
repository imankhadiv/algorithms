package com.irast.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RangeCombinerTest {

    RangeCombiner rangeCombiner;

    @Before
    public void setup() {
        rangeCombiner = new RangeCombiner();
    }

    @Test
    public void shouldReturnSameRange() {

        List<Range> rangeList = Arrays.asList(new Range(0, 10), new Range(20, 30), new Range(40, 50));
        List<Range> expected = Arrays.asList(new Range(0, 10), new Range(20, 30), new Range(40, 50));

        assertThat(rangeCombiner.combineRangeList(rangeList), is(expected));

    }

    @Test
    public void shouldNotReturnSameRange() {

        List<Range> rangeList = Arrays.asList(new Range(0, 10), new Range(10, 30), new Range(40, 50));
        List<Range> expected = Arrays.asList(new Range(0, 30), new Range(40, 50));

        assertThat(rangeCombiner.combineRangeList(rangeList), is(expected));

    }

    @Test
    public void shouldNotReturnSameRangeWhenOverlapped() {

        List<Range> rangeList = Arrays.asList(new Range(0, 10), new Range(5, 9), new Range(40, 50));
        List<Range> expected = Arrays.asList(new Range(0, 10), new Range(40, 50));

        assertThat(rangeCombiner.combineRangeList(rangeList), is(expected));
    }

    @Test
    public void shouldNotReturnSameRangeWhenThereIsOnlyOneRange() {

        List<Range> rangeList = Arrays.asList(new Range(0, 10));
        List<Range> expected = Arrays.asList(new Range(0, 10));

        assertThat(rangeCombiner.combineRangeList(rangeList), is(expected));
    }

    @Test
    public void shouldSortAndCombineTheList() {

        List<Range> rangeList = Arrays.asList(new Range(0, 10), new Range(5, 15), new Range(-20, 0));
        List<Range> expected = Arrays.asList(new Range(-20, 15));

        assertThat(rangeCombiner.combineRangeList(rangeList), is(expected));
    }


}