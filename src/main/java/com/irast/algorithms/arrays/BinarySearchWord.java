package com.irast.algorithms.arrays;

public class BinarySearchWord {

    public int search(String[] input, String word) {
        return search(input, word, 0, input.length);
    }

    private int search(String[] input, String word, int start, int end) {

        if (end < start) return -1;
        int mid = (start + end) / 2;

        String midVal = input[mid];
        if (midVal.isEmpty()) {
            int left = mid - 1;
            int right = mid + 1;
            while (true) {
                if (left < start || right > end) return -1;
                else if (left >= start && !input[left].isEmpty()) {
                    mid = left;
                    break;
                } else if (right <= end && !input[right].isEmpty()) {
                    mid = right;
                    break;
                }
                left--;
                right++;
            }
        }
        midVal = input[mid];
        if (midVal.compareTo(word) == 0) return mid;
        else if (midVal.compareTo(word) > 0) return search(input, word, start, mid - 1);
        else return search(input, word, mid + 1, end);

    }
}
