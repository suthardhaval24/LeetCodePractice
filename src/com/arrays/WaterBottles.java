package com.arrays;

public class WaterBottles {
    public static void main(String[] args) {
        int max = numWaterBottles(15, 4);
        System.out.println(max);
    }

    private static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int rem = numBottles%numExchange;
            numBottles/=numExchange;
            ans+=numBottles;
            numBottles+=rem;
        }

        return ans;
    }
}
