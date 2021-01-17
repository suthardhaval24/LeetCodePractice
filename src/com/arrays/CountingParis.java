package com.arrays;

import java.util.*;

public class CountingParis {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>(Arrays.asList(1,1,1,2));
        System.out.println(findPairs(num,1));
    }

    public static int findPairs(List<Integer> nums, int k) {
        //edge case
        if (nums == null || nums.size() == 0 || k < 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
