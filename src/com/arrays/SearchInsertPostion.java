package com.arrays;
/*
Leetcode Easy
 */

public class SearchInsertPostion {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int ele =0;
        int output =  searchInsert(arr,ele);
        System.out.println(output);
    }

    private static int searchInsert(int [] nums,int target){
        int left=0;
        int right= nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
