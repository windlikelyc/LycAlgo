package algorithm.Problems.BestTimeToBuyAndSellStock1_2_3_4_Ex;


import java.util.Arrays;

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
     * 卖完后又1天冷却cd
     * sell ： 第i 天 卖出 的收益
     * buy  ： 第i 天 买入 的收益
     *
     *  第 i 天 卖的收益： 要么和昨天一样（未持股）， 要么卖了（昨天买入后的收益+今天卖出收益），两者取最大值
     *  第 i 天 买的收益： 要么和昨天一样（还是持那么多股） ， 要么前天卖今天买（前天卖后的收益-今天买的收益），两者取最大值

     * @param prices
     * @return
     */
    public int maxProfixWithCoolDown(int[] prices) {
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        if (prices.length < 1) return 0;
        buy[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy[i] = Math.max(buy[i - 1], (i > 1 ? sell[i - 2] : 0) - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
        }
        System.out.println("buy" + Arrays.toString(buy));
        System.out.println("sell" + Arrays.toString(sell));
        return sell[prices.length - 1];
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

}
