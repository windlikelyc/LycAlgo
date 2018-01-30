package testAlgo.ch04.minchangeMoney;

import java.util.Arrays;

public class MinChangeMoneySolution {


    /**
     *
     * @param moneys 每个值代表一种面值，可以任意多张
     * @param aim 待找开的整钱数
     * @return 最少的纸币数
     */
    public static int money(int[] moneys,int aim) {
        if( moneys == null || moneys.length == 0 || aim == 0) return 0;

        int max = Integer.MAX_VALUE;
        int n = moneys.length;
        int[][] dp = new int[n][aim + 1];
        for(int j = 1 ; j <= aim ;j++) {
            dp[0][j] = max;
            if (j - moneys[0] >= 0 && dp[0][j - moneys[0]] != max) {
                dp[0][j] = dp[0][j - moneys[0]] + 1;
            }
        }
        int left = 0;
        for (int i = 0; i < n; i ++) {
            for(int j = 1 ; j <= aim ; j++) {
                left = max;
                if (j - moneys[i] >= 0 && dp[i][j - moneys[i]] != max) {
                    left = dp[i][j - moneys[i]] + 1;
                }
                dp[i][j] = Math.min(left, dp[i - 1][j]);
            }
        }

        return dp[n - 1][aim] != max ? dp[n - 1][aim] : -1;


    }
}
