package com.irast.algorithms.arrays;

public class ArrayGenerator {

    public int[] generateOddNumberFromRange(int start, int end) {

        int startIdx = start % 2 == 0 ? start + 1 : start;
        int endIdx = end % 2 == 0 ? end - 1 : end;
        int size = (endIdx - startIdx) / 2 + 1;
        int[] result = new int[size];
        System.out.println(result.length);
        for (int i = 0; i < size; i++) {
            result[i] = startIdx;
            startIdx += 2;
        }
        return result;
    }
}
