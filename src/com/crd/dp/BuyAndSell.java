package com.crd.dp;

public class BuyAndSell {
	public static void main(String args[]) {
		int a[] = { 7, 1, 5, 3, 6, 4 };
		// edge case
		if (a == null || a.length == 0) {
			System.out.println(0);
		}
		// maximize
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			} else {
				max = Math.max(max, a[i] - min);
			}
		}
		System.out.println(max);
	}
}
