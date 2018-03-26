package com.irast.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalanceParenthesesTest {

    BalanceParentheses app;

    @Before
    public void setUp() throws Exception {
        app = new BalanceParentheses();
    }

    @Test
    public void shouldReturnTrueWhenItIsBalanced() {
        String input = "[](){[]}";
        Assert.assertTrue(app.isBalanced(input));
    }

    @Test
    public void shouldReturnFalseWhenItIsNotBalanced() {
        String input = "[](){[]";
        Assert.assertFalse(app.isBalanced(input));
    }
}