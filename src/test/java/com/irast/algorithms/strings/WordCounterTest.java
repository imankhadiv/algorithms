package com.irast.algorithms.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {

    WordCounter app;

    @Before
    public void setUp() throws Exception {
        app = new WordCounter();
    }

    @Test
    public void countWords() {

        String input = "ben ate hay";
        int expected = 3;
        Assert.assertEquals(expected, app.countWords(input));
    }
    @Test
    public void countWordsWhenThereIsSpaceAtTail() {

        String input = "ben ate hay  ";
        int expected = 3;
        Assert.assertEquals(expected, app.countWords(input));
    }
    @Test
    public void countWordsWhenThereIsSpaceAtHead() {

        String input = "  ben ate hay";
        int expected = 3;
        Assert.assertEquals(expected, app.countWords(input));
    }
}