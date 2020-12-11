package com.arrays;

import java.util.Arrays;

public class MinPilesEqualHeight {
    public static void main(String[] args) {
        int piles[] = {4, 5,5,2,4};
        int ans = getMinSteps(piles);
        System.out.println(ans);
    }

    private static int getMinSteps(int[] piles) {
        int len = piles.length;
        if (len <= 1) return 0;
        Arrays.sort(piles);
        int res = 0, distinctNums = 0;
        for (int i = 1; i < len; ++i) {
            if (piles[i] == piles[i - 1]) {
                res += distinctNums;
            } else {
                ++distinctNums;
                res += distinctNums;
            }
        }
        return res;
    }
}
