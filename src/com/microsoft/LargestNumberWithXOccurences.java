package com.microsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LargestNumberWithXOccurences {
    public static void main(String[] args) {
        int a[] = {5, 5, 5, 5, 5};
        int ans = solution(a);
        System.out.println(ans);
    }

    private static int solution(int a[]) {
        //bae case
        if (a == null || a.length == 0) {
            return 0;
        }

        int ans = 0;
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int i : a) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry map : freq.entrySet()) {
            if ((int) map.getKey() == (int) map.getValue()) {
                ans = (int) map.getKey();
            }
        }
        return ans;
    }
}
