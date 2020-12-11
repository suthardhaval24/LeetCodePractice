package com.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * LC MEDIUM
 * SPACE: O(n)
 * TIME:  O(2n)
 */

public class SubSet2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDup(a);
        System.out.println(ans);
    }

    private static List<List<Integer>> subsetsWithDup(int a[]) {
        List<List<Integer>> subset = new ArrayList<>();
        generateSubset(0, a, new ArrayList<>(), subset);
        return subset;
    }

    private static void generateSubset(int index, int[] a, List<Integer> current, List<List<Integer>> subset) {
        subset.add(new ArrayList<>(current));
        for (int i = index; i < a.length; i++) {
            if(i > index && a[i] == a[i-1]) continue;
            current.add(a[i]);
            generateSubset(i + 1, a, current, subset);
            current.remove(current.size() - 1);
        }
    }
}
