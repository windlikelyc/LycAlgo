package LycAlgo.Problems.findminMove;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by lyc on 2017/9/5.
 */
public class Solution {

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

    @Test
    public void test() {
        findminmove(new int[]{1, 123, 48});
    }
}
