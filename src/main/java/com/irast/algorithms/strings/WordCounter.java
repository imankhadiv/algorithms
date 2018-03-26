package com.irast.algorithms.strings;

public class WordCounter {


    public int countWords(String s) {
        int i = 0;
        int count = 0;
        boolean isWord = false;
        while (i < s.length()) {
            while (Character.isWhitespace(s.charAt(i)) && i < s.length() - 1) {
                i++;
                isWord = false;
            }
            if (i == s.length() - 1) return count;
            while (!Character.isWhitespace(s.charAt(i)) && i < s.length() - 1) {
                i++;
                isWord = true;
            }
            if (isWord) count++;
        }
        return count;
    }
}
