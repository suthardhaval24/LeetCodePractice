package com.arrays;

/**
 * leetcode easy
 * Time -> 0(nLogn)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDiffernece {
    public static void main(String[] args) {
        int a[] = {4, 2, 1, 3};
        List<List<Integer>> ans = minimumAbsDifference(a);
        System.out.println(ans);
    }

    private static List<List<Integer>> minimumAbsDifference(int a[]) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++)
            min = Math.min(min, a[i + 1] - a[i]);

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] == min) {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i]);
                temp.add(a[i + 1]);
                ansList.add(temp);
            }
        }

        return ansList;
    }
}
