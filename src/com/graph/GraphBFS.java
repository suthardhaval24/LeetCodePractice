package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {
    private  int v;
    private LinkedList<Integer> adjList[];

    public GraphBFS(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for(int i=0;i<v;++i){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adjList[v].add(w);
    }


    void BFS(int s){
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while(queue.size()!=0){
            s =queue.poll();
            System.out.print(s +" ");
            Iterator<Integer> i =   adjList[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        g.BFS(2);
    }

}
