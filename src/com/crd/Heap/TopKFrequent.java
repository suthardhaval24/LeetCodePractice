package com.crd.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
	public static void main(String args[]) {
		String s[] = { "i", "love", "leetcode", "i", "love", "coding" };
		int k = 2;
		TopKFrequent freq = new TopKFrequent();
		List<String> ans = freq.topKFrequent(s, k);
		for (String word : ans) {
			System.out.println(word);
		}
	}

	private List<String> topKFrequent(String s[], int k) {
		// to store a result
		List<String> result = new ArrayList<String>();

		// push into hash map
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String word : s) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		// maxheap
		PriorityQueue<String> pq = new PriorityQueue<String>(
				(a, b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a) - map.get(b));

		for (String word : map.keySet()) {
			pq.offer(word);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		while (!pq.isEmpty()) {
			result.add(pq.poll());
		}
		Collections.reverse(result);
		return result;
	}
}