package com.dynamincProgrammig;

/**
 *Leetcode Medium --> o(n*m)
 */

public class CircularArray {
    public static void main(String[] args) {
        int n = 10;
        int m = 4;
        int endNode[] = {1, 5, 10, 5};
        int ans = bruteForce(n, m, endNode);
        System.out.println(ans);
    }

    private static int bruteForce(int n, int m, int[] endNode) {
        int count[] = new int[n + 1];
        for (int i = 0; i < endNode.length-1; i++) {
            int start = endNode[i];
            int end = endNode[i + 1];
            if (start <= end) {
                for (int j = start; j <= end; j++) {
                    count[j]++;
                }
            } else {
                for (int j = start; j <= n; j++)
                    count[j]++;
                for (int j = 1; j <= end; j++)
                    count[j]++;
            }
        }

        int max = 0, most = 0;
        for (int i = 1; i <= n; i++) {
            if (count[i] > max) {
                max = count[i];
                most = i;
            }
        }
        return most;
    }
}
