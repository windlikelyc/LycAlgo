package LycAlgo.Problems.MaxmumSwap;

public class Solution {

    private final int MIN = Integer.MIN_VALUE;

    /**
     *
     * @param m  max carrage of bag
     * @param n  counts of objects
     * @param w the weights
     * @param p the walue
     * @return
     */
    public static int[][] backpack(int m, int n, int[] w, int[] p) {

        int dp[][] = new int[n + 1][m + 1];

        for(int i = 0 ; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for(int i = 1;i < n+1;i++) {
            for(int j = 1 ; j < m + 1;j++) {
                if (w[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + p[i - 1]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        int m = 10;
        int n = 3;
        int[] w = {3, 4, 5};
        int[] p = {4, 5, 6};
        int[][] c = backpack(m, n, w, p);
        for(int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                System.out.print(c[i][j] + "\t");
                if (j == m) {
                    System.out.println();
                }
            }
        }

    }

}
