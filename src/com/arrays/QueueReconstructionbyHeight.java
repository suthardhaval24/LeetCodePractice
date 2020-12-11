package com.arrays;
/*
Leetcode medium
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueReconstructionbyHeight {
    public static void main(String[] args) {
        int height[][] = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        height = reConstructQueue(height);
        for(int[] a : height){
            for (int b: a){
                System.out.print(b);
            }
            System.out.println();
        }
    }

    private static int[][] reConstructQueue(int [][] people){
        Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[list.size()][]);
    }
}
