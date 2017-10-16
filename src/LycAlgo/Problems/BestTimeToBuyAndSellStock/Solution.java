package LycAlgo.Problems.BestTimeToBuyAndSellStock;

import org.junit.Test;

/**
 * Created by lyc on 2017/10/11.
 */
public class Solution {
    //[7, 1, 5, 3, 6, 4]
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    /**
     * 附上求最大子数组的方法
     * 注意0的处理和上述算法区别
     *
     * @param a
     * @param size
     * @return
     */
    int max_sub2(int a[], int size) {
        int i, max = 0, temp_sum = 0;
        for (i = 0; i < size; i++) {
            temp_sum += a[i];
            if (temp_sum > max)
                max = temp_sum;
            else if (temp_sum < 0)
                temp_sum = 0;
        }
        return max;
    }

    @Test
    public void test() {
        System.out.print(maxProfit(new int[]{7, 1, 5, -3, 6, 4}));
    }
}
