package com.crd.dp;

public class SecondMax {
	public static void main(String args[]) {
		int a[] = { 20, 34, 21, 87, 92, Integer.MAX_VALUE };
		if (a.length == 0 || a == null) {
			System.out.println("0");
		}

		int f_max = a[0];
		int s_max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > f_max) {
				s_max = f_max;
				f_max = a[i];
			}
		System.out.println(s_max);
	}
}
