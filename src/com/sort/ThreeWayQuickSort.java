package com.sort;
/*
DutchNationalFlag problem

when array has so many redundant elements
 */

public class ThreeWayQuickSort {
    public static void main(String[] args) {
        int a[] = {2, 0, 2, 1, 1, 0};
        a = threeWayQuickSort(a);
        for (int b : a) {
            System.out.print(b + " ");
        }
    }

    private static int[] threeWayQuickSort(int[] a) {
        int low = 0;
        int high = a.length - 1;
        for (int i = low; i <= high; ) {
            if (a[i] == 0) {
                // swap A[i] and A[low] and i,low both ++
                int temp = a[i];
                a[i] = a[low];
                a[low] = temp;
                i++;
                low++;
            } else if (a[i] == 2) {
                //swap A[i] and A[high] and high--;
                int temp = a[i];
                a[i] = a[high];
                a[high] = temp;
                high--;
            } else {
                i++;
            }
        }
        return a;
    }
}
