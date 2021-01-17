package com.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int nums[]= {4,3,2,7,8,2,3,1};
        List<Integer> ans =  findDuplicatesUsingSet(nums);
        for(int i :ans){
            System.out.print(i+" ");
        }
        System.out.println();
        ans = findDuplicatesUsingArray(nums);
        for(int i :ans){
            System.out.print(i+" ");
        }
    }

    private static  List<Integer> findDuplicatesUsingSet(int[] nums){
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> track = new HashMap<>();
        for(int i:nums){
            track.put(i,track.getOrDefault(i,0)+1);
        }

        for(Map.Entry map: track.entrySet()){
            if((int)map.getValue() > 1){
                ans.add((int)map.getKey());
            }
        }
        return ans;
    }

    private static List<Integer> findDuplicatesUsingArray(int[] nums){
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                ans.add(Math.abs(index)+1);
            }
            nums[index]=-nums[index];
        }
        return ans;
    }

}
