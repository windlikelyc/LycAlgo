package LycAlgo.DynamicProgramming.robber;

/**
 * Created by lyc on 2017/11/14.
 */


/**          1000- 1 - 1- 100 - 7
 *           |                 |
 *           ----------------
 *
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(robOnStreet(nums, 0, nums.length - 2) ,robOnStreet(nums, 1, nums.length - 1));

    }

    // 在一条街上，初始时 low  = 0 . higth = nums.length - 1
    private int robOnStreet(int[] nums, int low , int high){

        if (high-low == 0) {
            return nums[high];
        }
        if (high-low == 1) {
            return Math.max(nums[low], nums[high]);
        }

        int[] dp = new int[high-low+1];

        dp[0] = nums[low];
        dp[1] = Math.max(nums[low], nums[low+1]);
        int index = 2;

        for(int i = low+2 ; i < high+1 ; i ++) {
            dp[index] = Math.max(dp[index - 2] + nums[i], dp[index - 1]);
            index++;

        }

        return dp[dp.length - 1];

    }

}
