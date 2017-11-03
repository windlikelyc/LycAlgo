package LycAlgo.Problems.findmin;

/**
 * Created by lyc on 2017/11/1.
 */
public class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = nums[i];
                break;
            }
        }
        return min;
    }
}
