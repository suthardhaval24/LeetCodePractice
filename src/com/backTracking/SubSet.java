package com.backTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> result = subsets(a);
        for (List<Integer> s : result) {
            System.out.println(s);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<>();
        generateSubset(0, nums, new ArrayList<>(), subset);
        return subset;
    }

    private static void generateSubset(int index, int[] nums, List<Integer> current, List<List<Integer>> subset) {
        subset.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubset(i + 1, nums, current, subset);
            current.remove(current.size() - 1);
        }
    }
}
