package com.string;

import java.util.HashSet;
import java.util.Set;

/*
Leetcode Hard : Combination of binary search + Robin-Karp Algorithm
 */
public class LongestDuplicateSubString {

    static long mod=0;

    public static void main(String[] args) {
        String s ="banana";
        String ans = longestDupSubstring( s);
        System.out.println(ans);
    }

    private static String longestDupSubstring(String S) {

        //rolling hash
        mod=(long)1<<32;
        int n=S.length();
        int left=1, right=n;
        char[] nums=S.toCharArray();
        while(left<=right){
            int mid=left+ (right-left)/2;

            if(search(mid,n,nums)!=-1) left=mid+1;
            else right=mid-1;
        }

        int start=search(left-1,n,nums);
        return S.substring(start,start+left-1);
    }

    private static int search(int l,int n, char[] nums){

        long h=0;
        for(int i=0;i<l;i++){
            h=(h*26 + (nums[i] - 'a'))%mod;
        }

        Set<Long> set=new HashSet<>();
        set.add(h);
        long aL = 1;
        for (int i = 1; i <= l; ++i) aL = (aL * 26) % mod;

        for(int i=1;i<n-l+1;i++){
            h=(long)(h*26-(nums[i-1]-'a')*aL%mod +mod)%mod;
            h= (h+(nums[i+l-1]-'a'))%mod;
            if(set.contains(h)) return i;
            set.add(h);
        }

        return -1;
    }
}
