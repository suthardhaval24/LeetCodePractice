package com.arrays;

/*
Leetcode Medium
 */
public class HIndexII {
    public static void main(String[] args) {
        int citations[] = {0, 1, 3, 5, 6};
        int output = hIndex(citations);
        System.out.println(output);
    }

    private static int hIndex(int [] citations){
        int len = citations.length;
        int left = 0;
        int right = len-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(citations[mid] == len-mid){
                return len-mid;
            }
            else if(citations[mid]>len-mid){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return len-left;
    }
}
