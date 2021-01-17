package com.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public static void main(String[] args) {
        int a[] = {1, 1, 2};
        int b[] = {1, 2, 3};
        List<List<Integer>> ans = kSmallesPair(a, b, 2);
        for (List<Integer> p : ans) {
            System.out.println(p);
        }
    }

    private static List<List<Integer>> kSmallesPair(int a[], int b[], int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if (a.length == 0 || b.length == 0 || k == 0) {
            return ans;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((p, q) -> (p[0] + p[1]) - (q[0] + q[1]));

        for (int i = 0; i < a.length && i < k; i++) {
            pq.offer(new int[]{a[i], b[0], 0});
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int curr[] = pq.poll();
            List<Integer> temp = new ArrayList<>();
            temp.add(curr[0]);
            temp.add(curr[1]);
            ans.add(temp);
            if (curr[2] == b.length - 1) continue;
            pq.offer(new int[]{curr[0], b[curr[2] + 1], curr[2] + 1});
        }
        return ans;

    }
}
