package LycAlgo.DynamicProgramming.LongestRepeatSubsequence;

import org.junit.Test;

/**
 * Created by lyc on 2017/9/21.
 */
public class MySolution {
    //求最长重复的公共子序列
    //abababc

    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }

    @Test
    public void test() {
        System.out.println(longestPalindromeSubseq("abaa"));

    }
}
