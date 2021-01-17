package com.test;

public class Demo {
    public static void main(String[] args) {
        int a[] = {11, 20, 24, 31, 10, 28, 15, 39, 8,6};
        int ans[] = findLargestIncrease(a);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    private static int[] findLargestIncrease(int a[]) {
        //base case
        int ans[] = new int[3];
        if (a == null || a.length == 0) {
            return ans;
        }

        int min = Integer.MAX_VALUE;
        int max = 0;
        int num1 = 0;
        int num2 = 0;


        for (int i = 0; i < a.length-1; i++) {
            if (a[i] < min) {
                num1 = min;
                min = a[i];
            } else {
                num1 = min;
                num2 = a[i];
                max = Math.max(max, a[i] - min);
            }
        }

        ans[0] = num1;
        ans[1] = num2;
        ans[2] = max;

        return ans;
    }
}
