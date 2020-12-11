package com.string;
/*
Leetcode easy
 */

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacterInString {
    public static void main(String[] args) {
        String s="harshil";
        Map<Character,Integer> track = new HashMap<>();
        for(char c : s.toCharArray()){
            track.put(c,track.getOrDefault(c,0)+1);
        }
        System.out.println("Using Hashmap");
        for(Map.Entry e: track.entrySet()){
            if((int)e.getValue()!=0){
                System.out.println((char)e.getKey()+" "+ (int)e.getValue());
            }
        }

        System.out.println("Using CHar Array");
        int result[] = repeatingCharacters(s);
        for(int i:result){
            if(i!=0)
            System.out.print(i+" ");
        }
    }

    private static int[] repeatingCharacters(String s){
        int result[] = new int[26];
        for(int i=0;i<s.length();i++){
            result[s.charAt(i)-'a']++;
        }
        return result;
    }
}
