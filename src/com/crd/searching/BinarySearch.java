package com.crd.searching;

public class BinarySearch {
	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 30 };
		BinarySearch bs = new BinarySearch();
		int index = bs.binarySaearch(arr, 2);
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at:" + index);
		}
	}

	public int binarySaearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
