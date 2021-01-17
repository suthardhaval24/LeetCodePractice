package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SprintRunner {
    public static void main(String[] args) {
        int a[] = {2, 4, 1, 3};
        int ans = findSprint(a, 5);
        System.out.println(ans);
    }

    private static int findSprint(int a[], int counter) {
        int track[] = new int[counter + 2];
        for (int i = 0; i < a.length - 1; i++) {
            int start = Math.min(a[i], a[i + 1]);
            int end = Math.max(a[i], a[i + 1]);
            track[start]++;
            track[end + 1]--;
        }

        int scores[] = new int[counter + 1];
        var score = 0;
        for (int i = 1; i < counter + 1; i++) {
            score += track[i];
            scores[i] = score;
        }

        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i < counter + 1; i++) {
            result.put(i, scores[i]);
        }


        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((p, q) -> q.getValue() - p.getValue());
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            pq.add(entry);
        }

        return pq.poll().getKey();
    }
}
