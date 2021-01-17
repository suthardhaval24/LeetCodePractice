package com.arrays;

import java.util.concurrent.PriorityBlockingQueue;

public class ArrangingNumbes {

    static int count = 0;

    public static void main(String[] args) {
        int ans = arrangements(2);
        System.out.println(ans);
        System.out.println(String.format("id = %08.2f", 423.147));
    }


    public static int arrangements(int N) {
        boolean[] visited = new boolean[N + 1];
        calculate(N, 1, visited);
        return count;
    }

    public static void calculate(int N, int pos, boolean[] visited) {
        if (pos > N)
            count++;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                calculate(N, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
}