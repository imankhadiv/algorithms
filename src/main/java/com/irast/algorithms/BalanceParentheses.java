package com.irast.algorithms;

import java.util.Stack;

public class BalanceParentheses {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case ']':
                    if (stack.isEmpty() || !stack.pop().equals('['))
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || !stack.pop().equals('{'))
                        return false;
                    break;
                default:
                    if (stack.isEmpty() || !stack.pop().equals('('))
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
