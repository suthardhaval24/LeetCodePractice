package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a backtracking problem -> Before doing this do subset1, subset2, Permutation1, Permutation2. [ idea is to take num, do not consider it]
 * LC: Medium
 * Space: O(n)
 * Time: O(2n)
 */

public class CombinationalTeam {
    public static void main(String[] args) {
        int candidate[] = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = combinationalSum(candidate, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> combinationalSum(int[] candidate, int target) {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(candidate); // it uses dual pivot quick sort for primitive data type
        backTrack(set, new ArrayList<>(), candidate, target, 0);
        return set;
    }

    private static void backTrack(List<List<Integer>> set, List<Integer> tempList, int[] candidate, int target, int start) {
        if (target < 0) return;
        else if (target == 0) {
            set.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidate.length; i++) {
                tempList.add(candidate[i]);
                backTrack(set, tempList, candidate, target - candidate[i], i); // because we can use same element for sum
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
