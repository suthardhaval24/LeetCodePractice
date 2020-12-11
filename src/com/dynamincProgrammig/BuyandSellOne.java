package com.dynamincProgrammig;
/*
Leetcode Easy
 */

public class BuyandSellOne {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = calculateProfit(prices);
        System.out.println(profit);
    }

    private static int calculateProfit(int[] prices){
        int max=0;
        int min = Integer.MAX_VALUE;

        for(int i =0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else{
                max = Math.max(max,prices[i]-min);
            }
        }
        return max;
    }
}
