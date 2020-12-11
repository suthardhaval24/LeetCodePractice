package com.arrays;

/**
 * Leetcode Medium
 * Kadane Algorithm
 * DP
 * TimeComplexity : O(n)
 * SpaceComplexity : O(1)
 */

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int a[] = {2, 3, -2, 4};
        int ans = maxProduct(a);
        System.out.println(ans);
    }

    private static int maxProduct(int a[]) {
        if (a == null || a.length == 0)
            return 0;

        int ans = a[0], min = ans, max = ans;
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= 0) {
                max = Math.max(a[i], max * a[i]);
                min = Math.min(a[i], min * a[i]);
            } else {
                int temp = max;
                max = Math.max(a[i], min * a[i]);
                min = Math.min(a[i], temp * a[i]);
            }

            ans = Math.max(ans, max);
        }
        return ans;
    }
}
