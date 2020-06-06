package com.problems;
/*
Leetcode easy
 */

public class TwoSumBinaryOperatior {
    public static void main(String[] args) {
        int sum = getSum(2,-3);
        System.out.println(sum);
    }

    private static int getSum(int a,int b){
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
