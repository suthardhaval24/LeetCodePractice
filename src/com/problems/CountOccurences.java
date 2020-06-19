package com.problems;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public static void main(String[] args) {
        String s = "occurrences";
        count(s);
    }

    private static void count(String s){
        //edge case
        if(s == null || s.isEmpty() ){
            System.out.println("Empty string");
        }

        //dictionary
        Map<Character,Integer> track = new HashMap<>();

        char word[] = s.toCharArray();

        for(char c: word){
            track.put(c,track.getOrDefault(c,0)+1);
        }

        //traverse through array
        for (Map.Entry entry : track.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }

    }
}
