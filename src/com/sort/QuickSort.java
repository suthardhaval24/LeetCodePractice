package com.sort;

public class QuickSort {
	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		System.out.println("Before");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		QuickSort quick = new QuickSort();
		// call
		quick.sort(arr, 0, arr.length - 1);
		System.out.println("After");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private void sort(int[] arr, int l, int r) {
		if (l < r) {
			int part = partition(arr, l, r);
			sort(arr, l, part - 1);
			sort(arr, part + 1, r);
		}
	}

	private int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l - 1;
		for (int j = l; j < r; j++) {
			if (arr[j] < pivot) {
				i++;
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;
		return i + 1;
	}

}
