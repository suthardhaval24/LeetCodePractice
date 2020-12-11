package com.binarysearch;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int find = sc.nextInt();
		int index = binarySearch(a, find);
		System.out.println(index);
	}

	static int binarySearch(int a[], int f) {
		int left = 0;
		int right = a.length;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == f) {
				return mid;
			} else if (a[mid] > f) {
				right = mid - 1;
			} else if (a[mid] < f) {
				left = mid + 1;
			}
		}
		return -1;
	}
}
