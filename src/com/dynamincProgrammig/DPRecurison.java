package com.dynamincProgrammig;

import java.util.Scanner;
/*
The normal recursion algorithm takes complexity of O(n)= 2^n where DP can solve it in linear time that is O(n)
 */

public class DPRecurison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int memo[] = new int[n + 1];
        int result = 0;
        System.out.println(fib(n, memo, result));
    }

    public static int fib(int n, int[] memo, int result) {
        if (memo[n] != 0)
            result = memo[n];
        if (n == 1 || n == 2)
            result = 1;
        else {
            result = fib(n - 1, memo, result) + fib(n - 2, memo, result);
            memo[n] = result;
        }
        return result;
    }
}
