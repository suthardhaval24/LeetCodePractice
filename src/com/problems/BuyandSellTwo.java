package com.problems;
/*
Leetcode Easy
 */

public class BuyandSellTwo {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = calculateProfit(prices);
        System.out.println(profit);
    }

    private static  int calculateProfit(int[] prices){
        int profit =0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                profit+= prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}
