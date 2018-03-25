package com.irast.algorithms.strings;

public class StringReversion {

    public String reverse(String s) {
        if (s.length() == 1) return s;
        return reverse(s.substring(1)) + s.substring(0, 1);
    }

    public String reverseOrderOfWords(String input) {
        StringBuilder sb = new StringBuilder();
        int start = input.length() - 1;
        int end = start;
        while (start > 0) {
            while ((input.charAt(start) == ' ') && start > 0) {
                end--;
                start--;
                sb.append(" ");
            }
            while ((input.charAt(start) != ' ') && start > 0) {
                start--;
            }
            if (start == 0) {
                if (input.charAt(start) != ' ') {
                    sb.append(input.substring(start, end + 1));
                } else {
                    sb.append(input.substring(start + 1, end + 1));
                    sb.append(" ");
                }
            } else {
                sb.append(input.substring(start + 1, end + 1));
            }
            end = start;
        }
        return sb.toString();
    }

}
