package com.arrays;

public class ArrayJourney {
    public static void main(String[] args) {
        int a[]={10,2,-10,5,20};
        System.out.println(journey(a,3));
    }
    private static int journey(int a[] , int k){
        if(a==null && a.length==0){
            return 0;
        }
        int dp[] = new int[a.length];
        dp[0]= 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i;j<(i+k) ;j++){
                dp[i+1] = Math.max(dp[i+1],dp[i]+a[j]);
            }
        }
        return dp[a.length-1];
    }
}
