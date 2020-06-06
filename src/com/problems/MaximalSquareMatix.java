package com.problems;
/*
Leetcode medium
 */

public class MaximalSquareMatix {

    public static void main(String[] args) {
        char[][] firstMatrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        int ans= maximalSquare(firstMatrix);
        System.out.println(ans);
    }


    public static int maximalSquare(char[][] matrix) {

        if(matrix == null || matrix.length == 0){
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int [][] dp = new int[2][n];
        int max= -1;

        int flag=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    dp[flag][j] = matrix[i][j]-'0';
                }
                else{
                    dp[flag][j] = matrix[i][j] == '1' ? Math.min(dp[flag][j - 1], Math.min(dp[flag ^ 1][j - 1], dp[flag ^ 1][j])) + 1 : 0;
                }
                max=Math.max(max,dp[flag][j]);
            }
            flag^=1;
        }
        return max*max;
    }
}
