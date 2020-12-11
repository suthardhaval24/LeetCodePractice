package com.bitwise;

public class Numberof1 {
    public static void main(String[] args) {
        int n= 00000000000000000000000010000000 ;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }

    private static int hammingWeight(int n){
        int count=0;
        while(n==1){
            count += n&1;
            n=n>>>1; //unsigned
        }
        return count;
    }

}
