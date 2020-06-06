package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Leetcode easy
 */
public class FindDisappredNumbers {
    public static void main(String[] args) {
        int nums[]= {4,3,2,7,8,2,3,1};
        List<Integer> ans =  findDisappearedNumbers(nums);
        for(int i :ans){
            System.out.print(i+" ");
        }
    }

    private static List<Integer> findDisappearedNumbers(int nums[]){
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0){
                nums[val] = -nums[val];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }

}
