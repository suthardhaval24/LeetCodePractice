package com.cerner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]) {
        int a[] = {2, 3, 5, 1, 6};
        int target = 11;
        List<Integer> ans = twoSum(a, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    private static List<Integer> twoSum(int a[], int target) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> track = new HashMap<Integer, Integer>();
        int index = 0;
        for (int i : a) {
            if (track.containsKey(target - i)) {
                ans.add(track.get(target - i));
                ans.add(index);
            } else {
                track.put(i, index);
                index++;
            }
        }
        return ans;
    }
}
