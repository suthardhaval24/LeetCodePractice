package com.graph;

import java.util.*;

/**
 * Graph : Leetcode Medium
 * Space: O(V+E) --- O(n+e) where n is room and e keys
 * Time: 0(V+E) --- O(n)
 * Classic DFS
 */
public class KeyAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> rooms = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList());
        boolean ans = canVisitAllRoom(rooms);
        System.out.println(ans);
    }

    private static boolean canVisitAllRoom(List<List<Integer>> rooms) {
        //set to keep track of visited or not
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        //DFS
        Stack<Integer> dfs = new Stack<>();
        dfs.add(0);
        while (!dfs.isEmpty()) {
            List<Integer> keys = rooms.get(dfs.pop());
            for (int key : keys) {
                if (!visited.contains(key)) {
                    visited.add(key);
                    dfs.add(key);
                }
            }
        }

        return visited.size() == rooms.size();
    }
}
