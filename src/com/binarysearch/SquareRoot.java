package com.binarysearch;

import java.util.Scanner;

/**
 * Leetcode Easy Binary Search
 */

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left=1,right =n;
        int ans=0;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid ==n/mid){
                ans=mid;
            }
            else if(mid<n/mid){
                left = mid +1;
            }
            else{
                right= mid-1;
            }
        }
        ans = right;
        System.out.println(ans);
    }
}
