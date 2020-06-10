package com.problems;

/*
Leetcode easy
 */

public class isSubSequence {
    public static void main(String[] args) {
        String s = "abc";
        String t =  "ahbgdc";

        boolean ans = isSubSequence(s,t);
        System.out.println(ans);
    }

    //two pointer approach
    private static boolean isSubSequence(String s, String t){
        if(s.length()==0) {
            return true;
        }

        int sIndex=0;
        int tIndex=0;

        while(tIndex < t.length()) {
            if (t.charAt(tIndex) == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
            tIndex++;
        }
        return false;
    }
}
