package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MostCharacterFreq {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = findFreq(s);
        System.out.println(c);
    }

    private static char findFreq(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        char c = pq.poll().getKey();
        return c;

    }
}
