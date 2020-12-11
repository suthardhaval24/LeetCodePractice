package com.sort;

public class MergeSort {
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Before");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		MergeSort merge = new MergeSort();
		merge.sort(arr, 0, arr.length - 1);
		System.out.println("After");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private void sort(int arr[], int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(arr, l, mid);
			sort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}
	}

	private void merge(int arr[], int l, int mid, int r) {
		// find the size of array to be merged
		int n1 = mid - l + 1;
		int n2 = r - mid;

		// create two temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}

		// Merge two temp arrays

		int i = 0, j = 0;

		// initlizeed index of merged sub array
		int k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// copy the remaining elements into the array
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}
}
