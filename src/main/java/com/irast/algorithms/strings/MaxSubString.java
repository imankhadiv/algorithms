package com.irast.algorithms.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaxSubString {

    public String findMaxSubStringWithNoDuplicate(String s) {

        String maxSub = "";
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            char ch = s.charAt(j);
            if(set.add(ch)){
                String sub = s.substring(i, ++j);
                maxSub = sub.length() > maxSub.length() ? sub : maxSub;
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return maxSub;
    }


    public List<String> getAllSubStrings(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list.add(s.substring(i, j));
            }
        }
        return list;
    }
    // time complexity 2N
    public int findMaxSubStringLengthWithNoDuplicate(String input) {
        int n = input.length();
        int i = 0, j = 0, count = 0;
        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {

            if (!set.contains(input.charAt(j))) {
                set.add(input.charAt(j++));
                count = Integer.max(count, j - i);
            } else {
                set.remove(input.charAt(i++));
            }

        }
        return count;
    }

}
