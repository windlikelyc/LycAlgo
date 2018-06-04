package testAlgo.ch04.minPath;

import java.util.Map;

public class MinPathSolution {

    /**
     * 给定一个矩阵，只能向右下走，元素代表路径，求最小路径和
     * @param m
     * @return
     *  O(M*N) O(M*N)
     */
    public static int minpath(int[][] m) {
        int[][] dp = new int[m.length][m[0].length];
        dp[0][0] = m[0][0];
        for(int i = 1 ; i < m.length ; i++) {
            dp[i][0] = m[i][0] + dp[i - 1][0];
        }

        for(int j = 1 ; j < m[0].length ; j++) {
            dp[0][j] = m[0][j] + dp[0][j-1];
        }

        for(int i = 1 ; i < m.length ; i++) {
            for(int j = 1; j < m[0].length ; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1])+m[i][j];
            }
        }

        return dp[m.length][m[0].length];
    }
}
