package com.irast.algorithms.arrays;

public class Stock {


    public int findMax(int[] prices) {

        int max = 0;
        int buy = 0;
        int sell = 0;
        int n = prices.length;
        int i = 0;
        while (i < n - 1) {

            while (i < n - 1 && prices[i + 1] <= prices[i]) i++;
            if (i == n - 1) break;
            buy = prices[i++];
            while (i < n - 1 && prices[i + 1] >= prices[i]) i++;
            sell = prices[i];

            //while (i < n  && prices[i - 1] < prices[i]) i++;
            //sell = prices[i-1];
            max = Integer.max(max, sell - buy);
        }

        return max;
    }
}
