package com.problems;
/*
Leetcode easy
 */

public class HammingDistance {
    public static void main(String[] args) {
        int distance = findHamming(2,5);
        System.out.println(distance);
    }
    private  static  int findHamming(int a, int b){
        int num = a ^ b;
        int count=0;
        while(num!=0){
            count+=num&1;
            num>>=1;
        }
        return count;
    }
}
