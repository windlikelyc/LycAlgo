package LycAlgo.GeekFork.coinChange;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    while (T-- != 0) {
      int N = scanner.nextInt();
      int[] jumps = new int[N];
      for (int i = 0; i < N; i++) {
        jumps[i] = scanner.nextInt();
      }
      System.out.println(get(jumps));
    }
 }

  private static int get(int[] jumps) {
    int n = jumps.length;
    int[] dp = new int[n];
    for(int i = 1 ; i < n;i++) {
      dp[i] = Integer.MAX_VALUE;
      for(int j = 0 ; j < i;j++) {
        if (i <= j + jumps[j] && dp[j] != Integer.MAX_VALUE) {
          dp[i] = Math.min(dp[i], dp[j]+1);
          break;
        }
      }
    }
    return dp[n-1] == Integer.MAX_VALUE ? -1 : dp[n-1];
  }
}
