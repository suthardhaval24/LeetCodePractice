package com.problems;

/*
Leetcode easy
 */

public class Palindrome {
    public static void main(String[] args) {
        String s = null;
        boolean ans = checkPalindrome(s);
        System.out.println(ans);
    }

    private static boolean checkPalindrome(String s){
        if(s==null || s.isEmpty()) {
            return  false;
        }

        for(int i =0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                return true;
            }
        }
        return  false;
    }
}
