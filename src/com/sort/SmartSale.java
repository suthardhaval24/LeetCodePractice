package com.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartSale {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(2);
//		arr.add(3);

		int m = 2;
		System.out.println(deleteProducts(arr, m));
	}

	public static int deleteProducts(List<Integer> ids, int m) {
		int n = ids.size();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		int size = 0;

		for (int i = 0; i < n; i++) {
			if (map.containsKey(ids.get(i)) == false) {
				map.put(ids.get(i), 1);
				size++;
			} else {
				map.put(ids.get(i), map.get(ids.get(i)) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			if (mp.getKey() <= m) {
				m -= mp.getKey();
				count++;
			} else
				return size - count;
		}
		return size - count;
	}

}
