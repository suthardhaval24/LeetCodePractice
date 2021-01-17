package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PowerCompany {
    public static void main(String[] args) {
        int model[] = {0};
        System.out.println(reduceCapacity(model, model.length));
    }

    private static int reduceCapacity(int model[], int n) {
        int roundOff = (int)Math.ceil(n/ 2.0);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : model) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.addAll(map.values());
        int count = 0;
        int result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
            count++;
            if (result >= roundOff) {
                return count;
            }
        }
        return count;
    }
}
