package com.arrays;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Leetcode Medium
 * Many techniques
 * o(Nlogk) using PQ
 */

public class KthLargestInArray {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int ans = findKthLargest(nums, 4);
        System.out.println(ans);
    }

    private static int findKthLargest(int[] nums, int k) {
        //solving using maxHeap PQ
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : nums) {
            maxHeap.offer(n);
        }

        int i = 1;
        while (i < k) {
            maxHeap.poll();
            i++;
        }

        return maxHeap.peek();
    }
}
