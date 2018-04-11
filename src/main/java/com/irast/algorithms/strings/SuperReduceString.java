package com.irast.algorithms.strings;

public class SuperReduceString {


    public String reduce(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                if (i+1 > s.length()) break;
                s = s.substring(0, i) + s.substring(i + 2, s.length());
                i = -1;
            }
        }
        return s.length() == 0 ? "Empty String" : s;
    }
}
