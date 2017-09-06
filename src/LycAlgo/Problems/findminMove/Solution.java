package LycAlgo.Problems.findminMove;

import java.util.Arrays;

/**
 * Created by lyc on 2017/9/5.
 */
//自己写的有点墨基

/**
 * 这思路蛮靠谱的
 * 先虚构一个标准，每次求两点到那个标准的距离之和
 * 当然这个标准要一定是中位数
 * 而且两个中位数一样
 */
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        while (i < j) {
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }
}
