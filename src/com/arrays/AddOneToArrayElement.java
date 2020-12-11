package com.arrays;
/*
Leetcode easy
 */

public class AddOneToArrayElement {

	public static void main(String args[]) {
		int a[] = { 9, 9, 9 };
		int copy[] = null;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < 9) {
				a[i]++;
			} else {
				a[i] = 0;
				if (i == 0) {
					copy = new int[a.length + 1];
					System.arraycopy(a, 0, copy, 1, a.length);
					copy[0] = 1;
				}
			}
		}

		if (copy != null) {
			for (int i : copy) {
				System.out.print(i);
			}
		} else {
			for (int i : a) {
				System.out.print(i);
			}
		}
	}

}
