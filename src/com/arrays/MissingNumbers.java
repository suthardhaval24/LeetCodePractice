package com.arrays;

import java.util.Arrays;

/**
 * Bitwise manipulation
 * o(n)
 */

public class MissingNumbers {
    public static void main(String[] args) {
        int a[] = {0,1};
        int ans = findMissingNumber(a);
        System.out.println(ans);
        Arrays.sort(a);
        int res = findMissingIfSorted(a);
        System.out.println(res);
    }

    private static int findMissingNumber(int nums[]) {
        int res = nums.length;
        for(int i=0;i< nums.length;i++){
            res = res^i^nums[i]; // a^b^b
        }
        return res;
    }

    private static int findMissingIfSorted(int nums[]){
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid]==mid){
                left=left+1;
            }
            else {
                right=right-1;
            }
        }
        return left;
    }


}
