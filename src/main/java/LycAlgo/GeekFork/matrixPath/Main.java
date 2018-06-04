package LycAlgo.GeekFork.matrixPath;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    while (T--!=0) {
      int n = scanner.nextInt();
      int[][] m = new int[n][n];
      int[][] dp = new int[n][n];
      int ma = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          m[i][j] = scanner.nextInt();
          if (i == 0) {
            dp[i][j] = m[i][j];
            ma = Math.max(ma, dp[i][j]);
          }
        }
      }

      for (int i = 1; i < n; i++) {
        for (int j = 0; j < n; j++) {
          int a = j - 1 < 0 ? 0 : dp[i - 1][j - 1];
          int b = dp[i - 1][j];
          int c = j + 1 > n - 1 ? 0 : dp[i - 1][j + 1];
          dp[i][j] = max(a, b, c) + m[i][j];
          ma = Math.max(ma, dp[i][j]);
        }
      }
      System.out.println(ma);
    }
  }

  private static int max(int a, int b, int c) {
    int tmp = a > b ? a : b;
    tmp = tmp > c ? tmp : c;
    return tmp;
  }

}
