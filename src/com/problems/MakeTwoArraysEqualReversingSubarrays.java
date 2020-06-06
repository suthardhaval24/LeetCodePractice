package com.problems;

import java.util.HashMap;
import java.util.Map;
/*
Leetcode easy
 */

public class MakeTwoArraysEqualReversingSubarrays {
    public static void main(String[] args) {
        int target[] = {1,2,3,4};
        int arrp[] = {2,4,1,3};
        boolean a = canBeEqual(target,arrp);
        System.out.println(a);
    }

    static public boolean canBeEqual(int[] target, int[] arr) {
        int a = target.length;
        int b = target.length;

        //if elements are not same
        if(a!=b){
            return false;
        }

        //for tracking
        Map<Integer,Integer> track = new HashMap<>();

        for (int i = 0; i < a; i++) {
            track.put(target[i], track.getOrDefault(target[i], 0) + 1); //add
            track.put(arr[i], track.getOrDefault(arr[i], 0) - 1);  // subtract
        }

        //traverse to check if there are similar
        for(int m: track.keySet()){
            if(track.get(m)!=0){
                return false;
            }
        }
        return true;
    }
}
