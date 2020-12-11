package com.arrays;

public class OddValuesInMatrix {
    public static void main(String args[]) {
        int n = 2, m = 3;
        int indices[][] = {{0,1},{1,1}};
        int ans = oddCells(n, m, indices);
        System.out.println(ans);
    }

    private static int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int ans[][] = new int[n][m];
        for (int a[] : indices) {
            int row = a[0];
            int column = a[1];
            for (int i = 0; i < m; i++) {
                ans[row][i]++;
            }
            for (int i = 0; i < n; i++) {
                ans[i][column]++;
            }
        }

        for (int i = 0; i < ans.length; i++)
            for (int j = 0; j < ans[0].length; j++) {
                if (ans[i][j] % 2 == 1) {
                    count++;
                }
            }
        return count;
    }
}