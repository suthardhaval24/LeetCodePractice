package com.sort;

import java.util.PriorityQueue;

public class KNearlySort {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        kSort(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void kSort(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k + 1; i++) {
            pq.add(a[i]);
        }

        int left = 0;
        for (int i = k + 1; i < a.length; i++) {
            a[left] = pq.poll();
            left++;
            pq.add(a[i]);
        }

        while (!pq.isEmpty()) {
            a[left] = pq.poll();
            left++;
        }
    }
}
