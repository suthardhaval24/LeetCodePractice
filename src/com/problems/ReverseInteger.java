package com.problems;

/*
Leetcode Easy
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int num = -912;
        int reverseNum = reverse(num);
        System.out.println(reverseNum);
    }

    private static int reverse(int x){
        int ans = 0;
        while(x!=0){
            int rem = x%10;
            int newAns= ans*10+rem;
            if((newAns-rem)/10!=ans){
                return 0;
            }
            ans = newAns;
            x/=10;
        }
        return ans;
    }
}
