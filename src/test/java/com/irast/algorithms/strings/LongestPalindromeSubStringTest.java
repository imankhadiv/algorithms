package com.irast.algorithms.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestPalindromeSubStringTest {

    LongestPalindromeSubString app;

    @Before
    public void setUp() {
        app = new LongestPalindromeSubString();
    }

    @Test
    public void shouldCheckIfInputIsPalindrome() {

        String input = "abcba";
        assertTrue(app.isInputPlaindrome(input));
    }
    @Test
    public void shouldCheckIfInputIsPalindrome2() {

        String input = "abcba";
        assertTrue(app.isInputPalindrome2(input));
    }

    @Test
    public void findLongestPalindromeSubstring() {

        String input = "aabaa";
        Assert.assertEquals("aabaa", app.findTheLongestPalindromeSubstring(input));
    }
}