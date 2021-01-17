package com.java;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        int a[] = {9,6,4,3,1,1};
        PriorityQueue<Integer> pq = new PriorityQueue<>((p,q)->q-p);
        for(int i:a){
            pq.add(i);
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


    }
}
