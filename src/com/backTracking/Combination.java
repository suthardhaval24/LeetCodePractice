package com.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        List<List<Integer>> result = comb(4, 2);
        for (List<Integer> s : result) {
            System.out.println(s);
        }
    }

    private static List<List<Integer>> comb(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        findComb(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private static void findComb(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if (k == 0) {
            combs.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i <= n; i++) {
            comb.add(i);
            findComb(combs, comb, i + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }
}
