package com.microsoft;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletionstoMakeCharacterFrequenciesUnique {
    public static void main(String[] args) {
        String s = "aaabbbcc";
        int ans = minDeletions(s);
        System.out.println(ans);
    }

    private static int minDeletions(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char freq[] = new char[26];
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            while (count > 0 && !used.add(count)) {
                count--;
                res++;
            }
        }
        return res;
    }
}
