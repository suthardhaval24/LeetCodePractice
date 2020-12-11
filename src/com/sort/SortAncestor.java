package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortAncestor {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Philippe I");
		list.add("Philip II");
		list = sortRoman(list);
		for (String s : list) {
			System.out.println(s);
		}
	}

	private static List<String> sortRoman(List<String> list) {
		int n = list.size();
		String names[] = list.toArray(new String[0]);
		// Arrays.toString(array);
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if (i != j) {
					String temp2 = "";
					String n1 = getName(names[i]);
					int o1 = getOrder(names[i]);
					String n2 = getName(names[j]);
					int o2 = getOrder(names[j]);
					if (n1.compareTo(n2) > 0) {
						temp2 = names[i];
						names[i] = names[j];
						names[j] = temp2;
					} else if (n1.compareTo(n2) == 0) {
						if (o1 > o2) {
							temp2 = names[i];
							names[i] = names[j];
							names[j] = temp2;
						}
					}
				}

			}
		return Arrays.asList(names);
	}

	private static String getName(String obj) {
		return obj.split(" ")[0];
	}

	private static int getOrder(String obj) {
		return getNumeric(obj.split(" ")[1]);
	}

	private static int getNumeric(String roman) {
		Map<Character, Integer> romanList = new HashMap<>();
		romanList.put('I', 1);
		romanList.put('V', 5);
		romanList.put('X', 10);
		romanList.put('L', 50);
		romanList.put('C', 100);
		romanList.put('D', 500);
		romanList.put('M', 1000);

		int total = 0;
		int temp = 0;
		char[] chars = roman.toCharArray();

		for (int i = (chars.length - 1); i >= 0; i--) {
			if (temp <= romanList.get(chars[i])) {
				total += romanList.get(chars[i]);
			} else {
				total -= romanList.get(chars[i]);
			}
			temp = romanList.get(chars[i]);
		}

		return total;
	}
}
