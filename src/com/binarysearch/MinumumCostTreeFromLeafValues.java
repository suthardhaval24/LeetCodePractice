package com.binarysearch;

public class MinumumCostTreeFromLeafValues {
    public static void main(String[] args) {
        int arr[] = {6, 2, 4};
        System.out.println(mctFromLeafValues(arr));
    }

    private static int mctFromLeafValues(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        return dfs(arr, 0, n - 1, dp);
    }

    public static int dfs(int arr[], int s, int e, int[][] dp) {
        if (s == e) {
            return 0;
        }

        if (dp[s][e] > 0) {
            return dp[s][e];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = s; i <e; i++) {
            int left = dfs(arr, s, i, dp);
            int right = dfs(arr, i + 1, e, dp);
            int maxLeft = 0, maxRight = 0;
            for (int j = s; j <= i; j++) maxLeft = Math.max(maxLeft, arr[j]);
            for (int j = i + 1; j <= e; j++) maxRight = Math.max(maxRight, arr[j]);
            ans = Math.min(ans, left + right + maxLeft * maxRight);
        }
        dp[s][e] = ans;
        return ans;
    }
}
