package com.irast.algorithms.strings;

public class LongestPalindromeSubString {


    public String findTheLongestPalindromeSubstring(String input) {
        String result = "";
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isInputPalindrome2(sub)) {
                    if (sub.length() > result.length()) {
                        result = sub;
                    }
                }
            }
        }
        return result;
    }

    //better approach
    public String findTheLongestPalindromeSubstring2(String input) {

        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = input.length(); j > i; j--) {
                String sub = input.substring(i, j);
                if (isInputPalindrome2(sub)) {
                    return sub;
                }
            }
        }
        return null;
    }

    public boolean isInputPlaindrome(String input) {

        StringBuilder stringJoiner = new StringBuilder(input);
        return stringJoiner.reverse().toString().equals(input);
    }

    public boolean isInputPalindrome2(String input) {

        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
