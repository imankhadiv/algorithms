package com.irast.algorithms.arrays;

public class KthNearestPoint {

    /*
        x is the point
        k the total number
     */
    public int[] findKthNearestPoints(int[] input, int x, int k) {
        int[] result = new int[k];

        return result;
    }

    //    private int findCrossOverPoint(int[] input, int x) {
//        if (input[0] >= x) {
//            return 0;
//        } else if (input[input.length - 1] <= x) {
//            return input.length - 1;
//        }
//        return findCrossOverPoint(input, start, end, x);
//
//    }
    private int findCrossOverPoint(int[] input, int start, int end, int x) {
        if (input[end] <= x) return end;
        if (input[start] > x) return start;
        int mid = (start + end) / 2;
        if (input[mid] <= x && input[mid + 1] > x) return mid;
        if (input[mid] < x) return findCrossOverPoint(input, mid + 1, end, x);
        return findCrossOverPoint(input, start, mid - 1, x);
    }


}
