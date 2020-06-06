package com.problems;
/*
Easy
 */

import java.util.Scanner;

public class FabSeries {
	public static void main(String args[]) {
		int a = 0, b = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Using Recursion");
		System.out.println(fab(n));
		System.out.println("Using Iterative");
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
	}

	public static int fab(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number cannot be Negative");
		}
		if (n <= 1) {
			return n;
		}

		return fab(n - 1) + fab(n - 2);

	}
}
