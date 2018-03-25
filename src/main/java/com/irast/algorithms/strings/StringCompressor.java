package com.irast.algorithms.strings;

public class StringCompressor {

    public String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char previous = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (previous == current) {
                count++;
            } else {
                sb.append(previous).append(count);
                previous = current;
                count = 1;
            }
        }
        if(count > 1) sb.append(previous).append(count);
        return sb.toString();
    }
}
