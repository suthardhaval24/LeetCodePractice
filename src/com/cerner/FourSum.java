package com.cerner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair {
    public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class FourSum {

    public static void main(String args[]) {
        int a[] = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 20;
        int ans = fourSum(a, target);
        System.out.println(ans);
    }

    private static int fourSum(int a[], int target) {
        if (a == null || a.length == 0) {
            return 0;
        }

        int n = a.length;
        int count = 0;
        Map<Integer, List<Pair>> map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int val = target - (a[i] + a[j]);
                if (map.containsKey(val)) {
                    for (Pair pair : map.get(val)) {
                        int x = pair.x;
                        int y = pair.y;
                        if ((x != i && x != j) && (y != i && y != j)) {
                            count++;
                        }
                    }
                }
                map.putIfAbsent(a[i] + a[j], new ArrayList<>());
                map.get(a[i] + a[j]).add(new Pair(i, j));
            }
        }

        return count;
    }
}
