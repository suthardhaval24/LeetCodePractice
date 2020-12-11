package com.blackrocks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloudFrontCaching {
	public static void main(String args[]) {
		int n = 10;
		List<String> abc = new ArrayList<String>();
		abc.add("1 2");
		abc.add("1 3");
		abc.add("2 4");
		abc.add("3 5");
		abc.add("7 8");

		int num = findMinSum(n, abc);
		System.out.println(num);
	}

	private static int findMinSum(int n, List<String> abc) {

		int sum = 0;
		boolean visited[] = new boolean[n + 1];
		LinkedList<Integer> adj[] = new LinkedList[n + 1];
		LinkedList<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			adj[i] = new LinkedList<Integer>();
		}

		// graph creation
		for (String s : abc) {
			String[] str = s.split(" ");
			adj[Integer.parseInt(str[0])].add(Integer.parseInt(str[1]));
		}

		//visitng each vertex
		for (int i = 1; i <= n; i++) {
			//BFS
			if (visited[i] != true) {
				q.add(i);
				int temp = 0;
				while (q.size() != 0) {
					temp++;
					i = q.poll();
					Iterator<Integer> p = adj[i].listIterator();
					while (p.hasNext()) {
						int m = p.next();
						if (!visited[m]) {
							visited[m - 1] = true;
							q.add(m);
						}
					}

				}
				temp = (int) Math.ceil(Math.sqrt((double) temp));
				sum += temp;
			}
		}
		return sum;
	}
}
