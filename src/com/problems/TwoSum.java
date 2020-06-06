package com.problems;

/*
Leetcode easy
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2, 1, -11, 15};
        int target = 0;
        int ans[] = twoSum(nums,target);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        Map<Integer,Integer> map= new HashMap<>();
        int index=0;
        for(int i:nums){
            if(map.containsKey(target-i)){
                ans[1] =index;
                ans[0] = map.get(target-i);
            }
            map.put(i,index);
            index++;
        }


//        for(int i=0;i<nums.length;i++)
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    ans[0]=i;
//                    ans[1]=j;
//                }
//            }
        return ans;
    }
}
