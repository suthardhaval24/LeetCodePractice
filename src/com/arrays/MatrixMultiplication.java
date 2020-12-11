package com.arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int p = 3, q = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };


        int prod[][] = new int[m][q];

        matrixProduct(m, n, firstMatrix, q, secondMatrix, prod);

        display(m,q,prod);
    }

    private static void matrixProduct(int m, int n, int[][] a, int q, int[][] b, int[][] prod) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    prod[i][j] = a[i][k] * b[k][j];
                }
            }
        }
    }

       static void display(int m,int n,int[][] prod) {
        System.out.println("Answer of Addition of two matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
