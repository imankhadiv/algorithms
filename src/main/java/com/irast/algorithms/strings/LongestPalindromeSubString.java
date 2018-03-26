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
        while (i < j && input.charAt(i) == input.charAt(j)) {
            i++;
            j--;
        }
        return input.charAt(i) == input.charAt(j);
    }


    public String longestPalindromeN2(String s) {
        if(s.length() == 1) return s;
        int startIdx = 0;
        int endIdx = 1;
        int maxLength = 1;
        for (int i = 1; i < s.length(); i++) {
            int start = i - 1;
            int end = i;
            //even
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                if (end - start + 1 > maxLength) {
                    startIdx = start;
                    endIdx = end;
                    maxLength = (end - start) + 1;

                }
                start--;
                end++;
            }
            start = i - 1;
            end = i + 1;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                if (end - start + 1 > maxLength) {
                    startIdx = start;
                    endIdx = end;
                    maxLength = (end - start) + 1;
                }
                start--;
                end++;
            }
        }
        System.out.println(maxLength);
        System.out.println("Longest palindrome sub is: " + s.substring(startIdx, endIdx + 1));


        return s.substring(startIdx, endIdx + 1);


    }
}
