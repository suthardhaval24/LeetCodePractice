package com.sort;

public class InsertionSort {
	public static void main(String args[]) {
		int a[] = { 14, 33, 27, 35, 10 };
		InsertionSort insertion = new InsertionSort();
		a = insertion.sort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private int[] sort(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		return a;
	}
}
