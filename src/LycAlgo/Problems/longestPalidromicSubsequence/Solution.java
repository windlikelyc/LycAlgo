package LycAlgo.Problems.longestPalidromicSubsequence;

import org.junit.Test;

public class Solution {
  public int longestPalindromeSubseq(String s) {
    if(s==null || s.length() == 0 ) return 0;
    int[][] dp = new int[s.length()][s.length()];
    for (int i = s.length() - 1; i >= 0; i--) {
      for (int j = i; j < s.length() ; j++ ) {
        if(i == j){
          dp[i][j] = 1;
        }else {
          if(s.charAt(i) == s.charAt(j)){
            if(j-i<=1){
              dp[i][j] = 2;
            }else {
              dp[i][j] = dp[i + 1][j - 1] + 2;
            }
          }else {
            dp[i][j] = Math.max(dp[i][j - 1],dp[i+1][j]);
          }
        }
      }
    }
    return dp[0][s.length() - 1];
  }

  @Test
  public void test(){
    System.out.println(longestPalindromeSubseq("cbbd"));;
  }
}
