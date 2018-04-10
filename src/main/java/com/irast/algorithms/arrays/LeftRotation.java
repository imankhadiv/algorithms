package com.irast.algorithms.arrays;

public class LeftRotation {

    public int[] rotateToLeft(int[] input, int n) {
        int[] result = new int[input.length];
        int i = n;
        int j = 0;
        while (i > 0){
            result[input.length - i--] = input[j++];
        }

        for(j = 0  ; j < input.length - n ; j++){
            result[j] = input[j + n];
        }
        return result;
    }
}
