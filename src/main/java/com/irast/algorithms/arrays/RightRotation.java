package com.irast.algorithms.arrays;

public class RightRotation {


    public int[] rotate(int[] input, int k) {
        int[] result = new int[input.length];
        int i = 0;
        while (k > 0) {
            result[i++] = input[input.length - k];
            k--;
        }
        int j = 0;
        while (i < input.length) {
            result[i++] = input[j++];
        }
        return result;
    }
}
