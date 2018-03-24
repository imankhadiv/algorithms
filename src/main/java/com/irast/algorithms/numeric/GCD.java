package com.irast.algorithms.numeric;

public class GCD {
    public int gcd(int first, int second) {
        if (second == 0) return first;
        return gcd(second, first % second);
    }
}
