package com.crd.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapUsingPriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		pQueue.add(10);
		pQueue.add(30);
		pQueue.add(20);
		pQueue.add(400);
		System.out.println(pQueue.peek());
	}
}
