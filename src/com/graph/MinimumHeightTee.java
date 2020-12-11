package com.graph;

import java.util.*;

/**
 * Graph
 * Leetcode Medium
 * Space com : o(n) -> To store each element in Set
 * Time Com: 0(n) -> Traverse each node for construction, and to check minimum height
 * idea: to remove all the leaf node until height is 2 or  less.
 */
public class MinimumHeightTee {
    public static void main(String[] args) {
        int n = 4;
        int edges[][] = new int[][]{{1, 0}, {1, 2}, {1, 3}};
        List<Integer> ans = findMinHeightTrees(n, edges);
        System.out.println(ans);
    }

    private static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n <= 1) {
            return Arrays.asList(0);
        }
        Set<Integer>[] adj = new Set[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new HashSet<>();
        }
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        //BFS
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            //becausse start from leaf node
            if (adj[i].size() == 1) {
                q.offer(i);
            }
        }


        for (int i = n; i > 2; ) {
            for (int j = q.size(); j > 0; j--, i--) {
                int v1 = q.poll();
                int v2 = adj[v1].iterator().next(); // leaf can have only one parent;
                adj[v2].remove(v1);
                if (adj[v2].size() == 1) q.offer(v2);
            }
        }

        return q.size() == 1 ? Arrays.asList(q.poll()) : Arrays.asList(q.poll(), q.poll());

    }
}
