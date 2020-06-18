package com.problems;

/*
Leetcode easy
 */
public class IsAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }

    private static boolean isAnagram(String s, String t){
        int track[] = new int[25];

        for(int i=0;i<s.length();i++){
            track[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            track[t.charAt(i)-'a']--;
        }

        for(int i:track){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
