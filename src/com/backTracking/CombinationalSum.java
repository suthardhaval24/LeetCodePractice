package com.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationalSum {
    public static void main(String[] args) {
        int a[] = {2,3,6,7};
        List<List<Integer>> result = combinationSum(a,7);
        for (List<Integer> s : result) {
            System.out.println(s);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(candidates); // it uses dual pivot quick sort for primitive data type
        backTrack(set, new ArrayList<>(), candidates, target, 0);
        return set;
    }

    private static  void backTrack(List<List<Integer>> set, List<Integer> tempList, int[] candidates, int target, int start) {
        if (target < 0) return;
        else if (target == 0) {
            set.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backTrack(set, tempList, candidates, target - candidates[i], i); // because we can use same element for sum
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
