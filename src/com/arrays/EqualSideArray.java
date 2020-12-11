package com.arrays;

/**
 * Find an element in array such that sum of left array is equal to sum of right array
 * Two pointer approach
 */
public class EqualSideArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 5};
        int ans = findEqualSideArray(a);
        System.out.println(ans);
    }

    private static int findEqualSideArray(int a[]) {
        int left_sum = 0, right_sum = 0;
        int i, j;
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            left_sum += a[i];
            right_sum += a[j];

            while (left_sum < right_sum && i < j) {
                i++;
                left_sum += a[i];
            }

            while (right_sum < left_sum && i < j) {
                j--;
                right_sum += a[j];
            }
        }

        if (left_sum == right_sum) {
            return a[i];
        } else {
            return -1;
        }

    }
}
