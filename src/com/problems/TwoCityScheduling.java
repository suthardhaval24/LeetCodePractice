package com.problems;

import java.util.Arrays;

/*
Leetcode easy
 */
public class TwoCityScheduling {
    public static void main(String[] args) {
        int costs[][] = {
                {10,20},
                {30,200},
                {400,50},
                {30,20}
        };

        int totalCost= twoCitySchedule(costs);
        System.out.println(totalCost);
    }

    private static int twoCitySchedule(int[][] costs){
        int length = costs.length/2;
        int minCost[] = new int[length*2];
        int totalCost=0;
        for(int i=0;i<costs.length;i++){
            totalCost+=costs[i][0];
        }

        for(int i=0;i<costs.length;i++){
            minCost[i]=costs[i][1]-costs[i][0];
        }

        Arrays.sort(minCost);

        for (int i=0;i<length;i++) {
                totalCost += minCost[i];
        }
        return  totalCost;
    }

}
