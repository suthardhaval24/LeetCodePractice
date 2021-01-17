package com.problems;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of column for Matrix");
        int n = sc.nextInt();
        System.out.println("Enter number of rows for Matrix");
        int m = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter elements of Matrix one");
        readMatrix(sc, n, m, a);
        System.out.println("Enter elements of Matrix two");
        int b[][] = new int[m][n];
        readMatrix(sc, n, m, b);

        int sum[][] = new int[m][n];
        sumOfMatrix(n, m, a, b, sum);

        MatrixMultiplication.display(m, n, sum);
    }

    private static void sumOfMatrix(int n, int m, int[][] a, int[][] b, int[][] sum) {
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
    }

    private static void readMatrix(Scanner sc, int n, int m, int[][] a) {
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element at:" + i + " " + j);
                a[i][j] = sc.nextInt();
            }
    }
}
