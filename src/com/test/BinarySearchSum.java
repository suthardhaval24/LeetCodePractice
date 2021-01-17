package com.test;

public class BinarySearchSum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int ans[] = findPair(a, 9);
        System.out.println(ans[0] + "-"+ ans[1]);
    }

    private static int[] findPair(int a[], int sum) {
        int left = 0;
        int right = a.length - 1;
        int ans[] = new int[2];
        while (left < right) {
            if (a[left] + a[right] == sum) {
                ans[0] = a[left];
                ans[1] = a[right];
                return ans;
            } else if (a[left] + a[right] > sum) {
                right--;
            } else if (a[left] + a[right] < sum) {
                left++;
            }
        }
        return ans;
    }
}
