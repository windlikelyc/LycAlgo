package algorithm.Problems.findminMove;


import java.util.Arrays;

/**
 * Created by lyc on 2017/9/6.
 */
public class MySolution {

    public int findminmove(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        if (l % 2 == 0) {
            return Math.min(count(nums, nums[l / 2]), count(nums, nums[l / 2] - 1));
        } else {
            return count(nums, nums[l / 2]);
        }
    }

    private int count(int[] nums, int b) {
        int as = 0;
        for (int i = 0; i < nums.length; i++) {
            as += Math.abs(nums[i] - b);
        }
        return as;
    }



}
