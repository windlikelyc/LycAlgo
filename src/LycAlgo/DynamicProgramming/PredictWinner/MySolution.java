package LycAlgo.DynamicProgramming.PredictWinner;

import org.junit.Test;

/**
 * Created by lyc on 2017/9/27.
 */
public class MySolution {
    public boolean preidctWinnner(int[] nums) {

        //转换为分别求两个人所能取得的最大点数和
        //  当前取得的最大点数等于之前取得最大点数加头和尾两者较大那个
        //  即 dp[i] = dp[i-1] + max( head , tail)
        // 问题是怎么表示两个数已经被取过了呢？（取过下标置1？两头遍历？任何时候，头和尾都是唯一的，对不对）
        int head = 0;
        int tail = nums.length - 1;

        int i = 0;
        int j = 0;
        int pick;
        int[] dp1 = new int[nums.length / 2 + 1];
        int[] dp2 = new int[nums.length / 2 + 1];

        boolean isPlayerTurn = true;
        while (head <= tail) {
            if (nums[head] > nums[tail]) {
                head++;
                pick = nums[head];
            } else {
                pick = nums[tail];
                tail--;
            }

            if (isPlayerTurn) {
                dp1[++i] = dp1[i - 1] + pick;
            } else {
                dp2[++j] = dp2[j - 1] + pick;
            }
            isPlayerTurn = !isPlayerTurn;

        }

        return dp1[i] >= dp2[j];

    }

    @Test
    public void test() {
        preidctWinnner(new int[]{1, 5, 233, 7});
    }

    //明显的贪心法，太经典啦


}
