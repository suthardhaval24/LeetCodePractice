package com.problems;
/*
Leetcode Easy
 */

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> ans = findPascal(5);
        for(List<Integer> a: ans){
            System.out.println(a);
        }
    }

    private static List<List<Integer>> findPascal(int rows){
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<rows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++)
                row.set(j, row.get(j)+row.get(j+1));
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }
}
