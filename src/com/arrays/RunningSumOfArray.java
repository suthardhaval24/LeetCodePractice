package com.arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int a[] = {3,1,2,10,1};
        int ans[] = runnigSum(a);
        for(int i:ans){
            System.out.println(i);
        }
    }

    private static int[] runnigSum(int sum[]){
        for(int i=1;i<sum.length;i++){
            sum[i]= sum[i]+sum[i-1];
        }
        return sum;
    }

}
