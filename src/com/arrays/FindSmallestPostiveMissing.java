package com.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode easy
 * Idea to use set
 * O(n)
 */

public class FindSmallestPostiveMissing {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 4, 1, 2};
        int ans = findMissingNumber(a);
        System.out.println(ans);
    }

    private static int findMissingNumber(int a[]) {
        Set<Integer> set = new HashSet<>();
        int b = 0;
        for (int i : a) {
            if (i > 0) {
                set.add(i);
            }
        }

        for (int i = 1; i < a.length + 1; i++) {
            if (!set.contains(i)) {
                b = i;
            }
        }
        return b;
    }
}
