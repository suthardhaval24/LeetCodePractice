package com.problems;

/*
Leetcode easy
 */

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        boolean ans = findHappyNumber(20 );
        System.out.println(ans);
    }

    private static boolean findHappyNumber(int num){
        long n = num;
        long temp =0;
        Set<Long> track = new HashSet<>();
        while(n>0){
            temp+=((n%10)*(n%10));
            n=n/10;
            if(n==0){
                if(temp==1){
                    return  true;
                }
                if(track.contains(temp)){
                    return false;
                }
                track.add(temp);
                n=temp;
                temp=0;
            }
        }
        return false;
    }
}
