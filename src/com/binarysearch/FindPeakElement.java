package com.binarysearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 5, 6, 4};
        if (a.length < 3) {
            System.out.println(-1);
        }

        int index = findPeakElementLinear(a);
        System.out.println(index);
    }

    private static int findPeakElementLinear(int a[]) {
        int index = -1;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                index = i;
            }
        }
        return index;
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
