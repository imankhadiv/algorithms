package com.irast.algorithms.numeric;

public class PrimeNumber {

    public boolean isPrimeNumber(int n) {

        for (int i = 2; i < n; i++) {
            for (int j = 0; j <= Math.sqrt(n); j++) {
                if (j * i == n) return false;
            }
        }
        return true;
    }
}
