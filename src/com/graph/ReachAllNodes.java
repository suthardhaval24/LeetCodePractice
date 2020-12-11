package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Minimum Number of Vertices to Reach All Nodes
 * Leetcode - Medium
 * Complexitiy :  TIME = O(E) // edges SPACE = O(N)
 */

public class ReachAllNodes {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> edges = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 2), Arrays.asList(2, 5), Arrays.asList(3, 4),
                Arrays.asList(4, 2));
        List<Integer> ans = findSmallestSetOfVertices(n, edges);
        for (int a : ans) {
            System.out.println(a);
        }
    }

    private static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        //just find nodes with indegrees 0 and add them to result because they are not reachable
        List<Integer> result = new ArrayList<>();
        int visited[] = new int[n];
        for (List<Integer> e : edges) {
            visited[e.get(1)] = 1;
        }
        for (int i = 0; i < visited.length; i++)
            if (visited[i] == 0) {
                result.add(i);
            }
        return result;
    }
}
