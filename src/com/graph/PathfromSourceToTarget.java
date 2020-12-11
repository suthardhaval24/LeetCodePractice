package com.graph;

import java.util.*;

/**
 * Leetcode Medium : All Paths from Source to Target
 * Complexity : 0(N^2*2^N)
 */
public class PathfromSourceToTarget {
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> result = getAllPaths(graph);
        {
            for (List a : result) {
                System.out.println(a);
            }
        }
    }

    private static List<List<Integer>> getAllPaths(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();
        //get goal node
        int goalNode = graph.length - 1;
        q.add(Arrays.asList(0));
        //BFS
        while (!q.isEmpty()) {
            List<Integer> path = q.poll();
            //get lastnode form queue poll element
            int lastNode = path.get(path.size() - 1);
            if (lastNode == goalNode) {
                result.add(new ArrayList<>(path));
            } else {
                int[] neighbours = graph[lastNode];
                for (int neighbor : neighbours) {
                    List<Integer> list = new ArrayList<>(path);
                    list.add(neighbor);
                    q.add(list);
                }
            }
        }
        return result;
    }
}
