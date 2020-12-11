package com.arrays;

public class PaintTheCeiling {
    public static void main(String[] args) {
        int n = 100, s = 9507446, k = 279028249, b = 366009408, m = 10000000;
        long a = 37537747383873671L;
        int ans = variantCounts(n, s, k, b, m, a);
        System.out.println(ans);
    }

    private static int variantCounts(int n, int s, int k, int b, int m, long a) {
        long sets[] = new long[n];
        sets[0] = s;
        int res = 0;
        for (int i = 1; i < n; i++) {
            sets[i] = ((k * sets[i - 1] + b) % m) + 1 + sets[i - 1];
        }

        int start = 0, end = sets.length - 1;
        while (start < end) {
            if (sets[start] * sets[end] <= a) {
                res = 2 * (end - start);
                start++;
            } else {
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (sets[i] * sets[i] <= a) {
                res++;
            }
        }
        return res;
    }
}
