package com.arrays;
/**
 * Easy - BOFA
 * complexity: O(mn) where m elements in a and n in b;
 */


import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
    public static void main(String[] args) {
        int a[] = {3, 5, 7, 8, 9, 1};
        int b[] = {1, 3, 6, 11, 12, 9};
        if (a.length == 0 || b.length == 0) {
            System.out.println(0);
        }
        int ans = findCommon(a, b);
        System.out.println(ans);
    }

    private static int findCommon(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();
        int occur = 0;
        for (int i : a) {
            set.add(i);
        }

        for (int i : b) {
            if (set.contains(i)) {
                occur++;
            }
        }

        return occur;
    }
}
