package com.test;

/**
 * @author Dhaval
 * TO understand recursion
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorail(10));
        boolean a[] = new boolean[5];
        for(boolean i:a){
            System.out.println(i);
        }
    }

    private static int findFactorail(int n){
        if(n<0){
            throw new IllegalArgumentException("Invalid Argument");
        }

        if(n<=1){
            return 1;
        }

        return n*findFactorail(n-1);

    }
}
