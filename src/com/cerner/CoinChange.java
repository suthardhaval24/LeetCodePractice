package com.cerner;

import java.util.Arrays;

/**
 * DP algorithn
 */
public class CoinChange {
    public static void main(String args[]) {
        int coin[] = {1, 2, 5};
        int amount = 11;
        int ans = coinChange(coin, amount);
        System.out.println(ans);
    }

    private static int coinChange(int[] coin, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<coin.length;j++){
                if(coin[j]<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-coin[j]]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
