package com.arrays;

public class SquareDistance {
    public static void main(String[] args) {
        int x[] = {5, 3, 1, 2};
        int y[] = {7, 9, 3, 4};
        long distance = findMinSquareDistance(x, y);
        System.out.println(distance);
    }

//    private static long findMinSquareDistance(int[] x, int[] y) {
//        long min = Long.MAX_VALUE;
//        for (int i = 0; i < x.length - 1; i++)
//            for (int j = i + 1; j < x.length; j++) {
//                long val = (long) ((long) Math.pow(Math.abs(x[i] - x[j]), 2) + Math.pow(Math.abs(y[i] - y[j]), 2));
//
//                if (val < min) {
//                    min = val;
//                }
//            }
//        return min;
//    }

    private static long findMinSquareDistance(int x[], int y[]) {
        long min = Long.MAX_VALUE;
        int left = 0, right = x.length - 1;
        while (left < right) {
            long val = (long) (Math.pow(Math.abs(x[left] - x[right]), 2) + Math.pow(Math.abs(y[left] - y[right]), 2));

            if (val < min) {
                min = val;
                left++;
            } else {
                right--;
            }
        }
        return min;

    }

}
