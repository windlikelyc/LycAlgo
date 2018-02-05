package LycAlgo.Problems.ContinusSubarrySum;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public boolean checkSubarraySum(int[] nums, int k) {
    int numof0 = 0;
    for (int i = 0 ; i < nums.length ; i++) {
      if (nums[i] == 0) {
        numof0++;
      }
    }
    if(k==0&&numof0 == nums.length) return true;

    //滑动窗口
//    int[][] dp = new int[nums.length][nums.length];

    for(int i = 0 ; i < nums.length ; i++) {
      int sum = 0;
      for(int j = i ; j < nums.length ; j++ ) {
        sum += nums[j];
//        dp[i][j] = sum;
        if (sum % k == 0 && i != j) {
          return true;
        }
      }
    }

//    LycAlgo.utils.martrix.martrix.show(dp);

    return false;
  }


}
