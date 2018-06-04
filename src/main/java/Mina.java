import java.util.Scanner;

public class Mina {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int T = s.nextInt();
    while (T-- != 0) {
      int m = s.nextInt();
      int n = s.nextInt();
      String str1 = s.next();
      String str2 = s.next();
      System.out.println(getcommen(str1,str2,m,n));
    }
  }

  private static int getcommen(String str1, String str2, int m, int n) {
    int[][] dp = new int[m + 1][n + 1];
    int maxLength = -1;
    for(int i = 0;i <= m;i++) {
      for(int j = 0;j<=n;j++) {
        if (i == 0 || j == 0) {
          continue;
        }
        if(str1.charAt(i-1)==str2.charAt(j-1)){
          dp[i][j] = dp[i - 1][j - 1] + 1;
          maxLength = Math.max(maxLength, dp[i][j]);
        }else {
          dp[i][j] = 0;
        }
      }
    }
    return maxLength;
  }
}
