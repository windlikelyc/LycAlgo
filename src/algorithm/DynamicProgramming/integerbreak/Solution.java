package algorithm.DynamicProgramming.integerbreak;


import java.util.Arrays;

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        dp[1] = 1;
        for(int i = 2 ; i <= n ; i++ ) {
            for(int j  = 1 ;  j <= i / 2 ; j++  ) {
                // i-j  *  j || dp[i - j]  *  j || i-j   *   dp[j]   ||  dp[i-j]   * dp[j]  四者取最大值
                int tmp = Math.max(  (i - j) * j , dp[i-j]  * j);

                int tmp1 = Math.max(tmp, (i - j) * dp[j]);

                int tmp2 = Math.max(tmp1, dp[i - j] * dp[j]);

                dp[i] = Math.max(dp[i], tmp2);
            }
        }

        return dp[n];
    }


}
