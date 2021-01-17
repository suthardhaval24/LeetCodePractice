package com.heap;

import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {
        char tasks[] = {'A', 'A', 'A', 'B', 'B', 'B'};
        int min = leastInterval(tasks, 2);
        System.out.println(min);
    }

    private static int leastInterval(char[] tasks, int n) {
        if (tasks.length == 1) {
            return 1;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : tasks) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.addAll(freq.values());

        int cycles = 0;

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                if (!pq.isEmpty()) {
                    temp.add(pq.remove());
                }
            }

            for (int i : temp) {
                if (--i > 0) {
                    pq.add(i);
                }
            }

            cycles += pq.isEmpty() ? temp.size() : n + 1;
        }

        return cycles;
    }
}
