package com.problems;

/*
Leetcode medium
 */
public class CountSquaeSubmatricesWithAllOnes {
    public static void main(String[] args) {
        int[][] firstMatrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };

        int ans = countSquares(firstMatrix);
        System.out.println(ans);
    }

    public static int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                    sum += dp[i][j];
                } else if (matrix[i][j] != 0) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    sum += dp[i][j];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return sum;
    }
}
