package com.crd.cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Leetcode Medium
 * Stratergy : Use Deqeue to track page size and element usage and map to store key and value
 * Time complexity:
 * Get -> O(1);
 * put -> O(1);
 */

class CacheEntry {
	int key;
	String value;

	public CacheEntry(int key, String value) {
		this.key = key;
		this.value = value;
	}

}

public class LRUCache {
	Deque<CacheEntry> queue = new LinkedList<CacheEntry>();
	Map<Integer, CacheEntry> map = new HashMap<>();
	int CACHE_SIZE = 3;

	public String getFromCache(int key) {
		if (map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			queue.remove(entry);
			queue.addFirst(entry);
			return entry.value;
		}

		return null;
	}

	public void putIntoCache(int key, String value) {
		// if map contais remove from quue and add new value to queue
		if (map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			queue.remove(entry);
		} else {
			// if size if full then remove from queue and map
			if (queue.size() == CACHE_SIZE) {
				CacheEntry entryToBeRemoved = queue.removeLast();
				map.remove(entryToBeRemoved.key);
			}
		}
		// if there is no same element and size in not full
		CacheEntry newEntry = new CacheEntry(key, value);
		queue.addFirst(newEntry);
		map.put(key, newEntry);
	}

	public static void main(String args[]) {
		LRUCache cache = new LRUCache();
		cache.putIntoCache(1, "Product-1-info");
		cache.putIntoCache(2, "Product-2-info");
		cache.putIntoCache(3, "Product-3-info");
		System.out.println(cache.getFromCache(1));
		cache.putIntoCache(3, "Product-3-info");
		System.out.println(cache.getFromCache(3));
		cache.putIntoCache(4, "Product-4-info");
		System.out.println(cache.getFromCache(2));

	}

}
