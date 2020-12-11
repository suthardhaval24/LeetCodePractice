package com.cerner;

public class PascalTriangle {
    public static void main(String args[]) {
        int n = 5;
        for (int line = 0; line < 5; line++) {
            for (int i = 0; i <= line; i++) {
                System.out.print(binomialCoff(line, i)+" ");
            }
            System.out.println();
        }
    }

    private static int binomialCoff(int n, int k) {
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}