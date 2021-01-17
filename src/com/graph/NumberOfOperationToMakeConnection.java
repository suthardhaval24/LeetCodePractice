package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Leetcode Medium*/

public class NumberOfOperationToMakeConnection {
    public static void main(String[] args) {
        int nodes = 4;
        int connections[][] = {{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(nodes,connections));
    }

    private static int makeConnected(int n, int[][] connections) {
        //step-1 : Make adjancey List
        int edges=0;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int[] conn:connections){
            graph.get(conn[0]).add(conn[1]);
            graph.get(conn[1]).add(conn[0]);
            edges++;
        }

        //step-2: count components using DFS
        int component= 0;
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false) {
                dfsUtil(i, graph, visited);
                component++;
            }
        }

        //step-3 calculate redudant edges
        if(edges<n-1){
            return -1;
        }

        int redudant = edges -((n-1)-(component-1));
        if(redudant >= component-1){
            return component-1;
        }

        return -1;
    }

    private static void dfsUtil(int source,Map<Integer,List<Integer>>graph, boolean[] visited){
        visited[source] = true;
        for(int neighbour: graph.get(source)){
            if(!visited[neighbour]){
                dfsUtil(neighbour,graph,visited);
            }
        }
    }
}
