package com.irast.algorithms.arrays;

import java.util.Arrays;

public class MergeSortedArrays {


    public int[] mergeSortedArrays(int[] first, int[] second) {

        int firstIndex = first.length - 1;
        int secondIndex = second.length - 1;
        int mergedIndex = firstIndex + secondIndex + 1;
        first = addMoreRoomToFirst(first, second.length);
        while (secondIndex >= 0) {

            if (firstIndex >= 0 && first[firstIndex] > second[secondIndex]) {
                first[mergedIndex--] = first[firstIndex];
                firstIndex--;
            } else {
                first[mergedIndex--] = second[secondIndex];
                secondIndex--;
            }
        }
        return first;

    }

    private int[] addMoreRoomToFirst(int[] first, int num) {
        return Arrays.copyOf(first, first.length + num);
    }
}

