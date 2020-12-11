package com.crd.searching;

public class LinearSearch {
	public static void main(String args[]) {
		int a[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		LinearSearch ls = new LinearSearch();
		int index = ls.searchElement(a, 130);
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at:" + index);
		}
	}

	public int searchElement(int[] arr, int target) {

		int index = -1;
		if (arr.length == 0) {
			return -1;
		}

		if (arr.length == 1 && arr[0] == target) {
			return 0;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				index = i;
			}
		}

		return index;
	}
}
