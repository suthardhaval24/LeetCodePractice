package com.arrays;

import java.util.Arrays;

public class DistributeChocolate {
    public static void main(String[] args) {
        int nums[] = {12,4,7,9,2,23,25,41,30, 40, 28, 42, 30, 44, 48,
                43, 50};
        int res = findMinDifference(nums, 7);
        System.out.println(res);
    }

    private static int findMinDifference(int nums[], int m) {

        if (nums.length == 0 || m == 0) {
            return 0;
        }

        //sort the array size
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < nums.length; i++) {
            int diff = nums[i + m - 1] - nums[i];
            min = Math.min(diff, min);
        }

        return min;
    }
}
