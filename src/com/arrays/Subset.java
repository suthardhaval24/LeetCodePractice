package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LC Medium
 * Space: O(n)
 * Time: O(n*2n) --> taking * not taking number
 */

public class Subset {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        List<List<Integer>> ans = subset(a);
        System.out.println(ans);
    }

    private static List<List<Integer>> subset(int a[]) {
        List<List<Integer>> subset = new ArrayList<>();
        Arrays.sort(a);
        generateSubset(0, a, new ArrayList<>(), subset);
        return subset;
    }

    private static void generateSubset(int index, int[] a, List<Integer> current, List<List<Integer>> subset) {
        subset.add(new ArrayList<>(current));
        for (int i = index; i < a.length; i++) {
            current.add(a[i]);
            generateSubset(i + 1, a, current, subset);
            current.remove(current.size() - 1);
        }
    }
}
