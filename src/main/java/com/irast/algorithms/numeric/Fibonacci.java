package com.irast.algorithms.numeric;

public class Fibonacci {

    long[] cached = new long[2000];

    public long findFibonacci(int n) {

        if (n <= 1) {
            cached[n] = 1;
        } else if (cached[n] == 0) {
            cached[n] = findFibonacci(n - 1) + findFibonacci(n - 2);
        }
        return cached[n];
    }


    public long findFibonacciWithParameter(int n) {

        long[] result = new long[2000];
        findFibonacci(n, result);
        System.out.println(result[0]);
        return result[n];

    }

    private long findFibonacci(int n, long[] result) {
        if (n <= 1) {
            result[n] = 1;
        }
        if (result[n] == 0) {
            result[n] = findFibonacci(n - 1, result) + findFibonacci(n - 2, result);
        }
        return result[n];
    }
}
