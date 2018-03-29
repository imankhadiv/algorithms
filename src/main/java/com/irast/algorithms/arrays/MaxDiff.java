package com.irast.algorithms.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxDiff {

    public int maxDifferenceBetweenElements(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
        }
        Arrays.sort(a);//        int[] input = {7,2,3,10,2,4,8,1};
        int l = a.length - 1;
        for (int i = 0; i <= l; i++) {
            if (i > l / 2) return -1;
            int firstIdx = map.get(a[i]);
            int secondIdx = map.get(a[l - i]);
            if (firstIdx < secondIdx) return (a[l] - a[i]);
            firstIdx = map.get(a[i + 1]);
            if (firstIdx < secondIdx) return (a[l] - a[i + 1]);
            firstIdx = map.get(a[i]);
            secondIdx = map.get(a[l - i - 1]);
            if (firstIdx < secondIdx) return (a[l] - a[i + 1]);
        }
        return -1;
    }

    public int maxDifferenceN2(int[] a) {

        int maxDiff = -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                maxDiff = Integer.max(maxDiff, a[j] - a[i]);
            }
        }
        return maxDiff;
    }

    //best approach!
    public int maxDifferenceN(int[] a) {

        int minElement = a[0];
        int maxDiff = a[1] - a[0];
        for (int i = 1; i < a.length; i++) {
            maxDiff = Integer.max(maxDiff, a[i] - minElement);
            minElement = Integer.min(minElement, a[i]);
        }
        return maxDiff <= -1 ? -1 : maxDiff;
    }

    //Another Tricky solution
    public int maxDifferenceNSpaceN(int[] a) {

        int[] diff = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            diff[i] = a[i + 1] - a[i];
        }
        // finding max sub array in diff array
        int maxSum = diff[0];
        for (int i = 1; i < diff.length; i++) {
            if (diff[i - 1] > 0) diff[i] += diff[i - 1];
            maxSum = Integer.max(maxSum, diff[i]);
        }
        return maxSum;
    }

}