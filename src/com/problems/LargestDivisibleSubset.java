package com.problems;

/*
Leetcode Medium
 */

import java.util.*;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int nums[] = {2,3,8,9,27};
        List<Integer> ans = largestDivisibleSubset(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }

    private static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        //edge case
        if (nums == null && nums.length == 0) {
            return ans;
        }

        //merge or quick
        Arrays.sort(nums);

        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        //for each elements in nums find largest subset

        for (int i = 1; i < nums.length; i++)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        //pick the index of the largest element in dp
        int maxIndex=0;
        for(int i=1;i<dp.length;i++){
            maxIndex = dp[i]>dp[maxIndex]?i:maxIndex;
        }

        //from nums[maxIndex] to 0, add every element belongs to the largest subset.
        int temp  =nums[maxIndex];
        int curDp = dp[maxIndex];
        for(int i=maxIndex;i>=0;i--){
            if (temp % nums[i] == 0 && dp[i] == curDp){
                ans.add(nums[i]);
                temp = nums[i];
                curDp--;
            }
        }
        Collections.sort(ans);
        return ans;
    }

}
