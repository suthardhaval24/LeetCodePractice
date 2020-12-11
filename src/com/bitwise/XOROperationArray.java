package com.bitwise;
/*
Leetcode easy
 */

public class XOROperationArray {
    public static void main(String[] args) {
        int n = 5,start=0;
        int ans = xorOperation(n,start);
        System.out.println(ans);
    }

    private static int xorOperation(int n,int start){
        int nums[] = new int[n];
        int ans = 0;
        for(int i=0;i<n;i++){
            nums[i]= start + (2*i);
        }

        for(int i=0;i<n;i++){
            ans ^= nums[i];
        }

        return ans;
    }
}
