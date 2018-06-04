package LycAlgo.GeekFork.LIS;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    while (T-- != 0) {
      int n = scanner.nextInt();
      int[] A = new int[n];
      for (int i = 0; i < n; i++) {
        A[i] = scanner.nextInt();
      }
      System.out.println(find(A));
    }
  }

  public static int find(int[] A) {
    if(A==null||A.length == 0) return 0;
    if(A.length == 1) return 1;

    int[] dp = new int[A.length];
    dp[0] = 1;
    int count = 0;
    for (int i= 1 ; i < A.length;i++) {
      int max = 1;
      for(int j = 0; j < i;j++) {
        if (A[i] > A[j]) {
          max = Math.max(max,dp[j]+1);
          count = Math.max(max, count);
        }
      }
      dp[i] = max;
    }
    return count;
  }
}
