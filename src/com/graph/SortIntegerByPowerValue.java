package com.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Sort Integers by The Power Value
 * LC -:> Medium
 * Space Comp : o(n)
 * Time Comp : o(n*iteration)
 */

public class SortIntegerByPowerValue {
    public static void main(String[] args) {
        int lo = 1, hi = 1000, k = 777;
        int ans = getKth(lo, hi, k);
        System.out.println(ans);
    }

    private static int getKth(int lo, int hi, int k) {
        //get value of n
        int n = hi - lo + 1;
        int nums[] = new int[n];
        //insert into array
        int temp = lo;
        for (int i = 0; i < n; i++) {
            nums[i] = temp;
            temp++;
        }

        Map<Integer, Integer> track = new HashMap<>();

        //get iteration to reduce to 1
        for (int i : nums) {
            int j = i;
            int count = 0;
            while (j != 1) {
                if (j % 2 == 0) {
                    j = j / 2;
                    count++;
                } else {
                    j = 3 * j + 1;
                    count++;
                }
            }
            track.put(i, count);
        }
        //PQ based on ascending
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : a.getValue() - b.getValue());

        //add element
        for (Map.Entry<Integer, Integer> entry : track.entrySet()) maxHeap.add(entry);

        int i = 1;
        while (i < k) {
            maxHeap.poll();
            i++;
        }

        return maxHeap.poll().getKey();
    }

}
