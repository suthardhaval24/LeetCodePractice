package com.binarysearch;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Dhaval
 */

public class MinimumComparison {
    public static void main(String[] args) {
        //initializing array
        int a[] = new int[1000000];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            //generating number in 1-1000 range
            a[i] = rd.nextInt(1000) + 1;
        }
        //sorting array
        Arrays.sort(a);
        int ans[] = minComparisons(a, 122);
        System.out.println("count of comparison = " + ans[0] + " element found on index = " + ans[1]);
    }

    /**
     * @param a
     * @param target
     * @return minimum number of comparision required find the target
     */
    private static int[] minComparisons(int a[], int target) {
        int ans[] = new int[2];
        int count = 0;
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                count++;
                ans[0] = count;
                ans[1] = mid;
                return ans;
            } else if (a[mid] > target) {
                right = mid - 1;
                count++;
            } else if (a[mid] < target) {
                left = mid + 1;
                count++;
            }
        }

        ans[0] = count;
        ans[1] = -1;
        return ans;
    }
}
