package com.irast.algorithms.arrays;

public class MatrixSearch {

    public boolean findItem(int[][] matrix, int item) {

        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            int num = matrix[row][col];
            if (num == item) return true;
            else if (num > item) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
