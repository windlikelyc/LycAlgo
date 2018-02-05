package LycAlgo.DynamicProgramming.LargestDividable;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lyc on 2017/11/8.
 */
public class Solution {
    // 1,2,3,4,6,12
    public List<Integer> largestDivisibleSubset(int[] nums) {

        // dp 存最长倍数链子长度
        int[] dp = new int[nums.length];
        //  index 维护一个最长链的下标
        int[] indexs = new int[nums.length];
        int m = 0;
        int mi = 0;

        List<Integer> numslist = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            numslist.add(nums[i]);
        }
        numslist.sort(Comparator.naturalOrder());

        // 从右向左遍历数组， i 指向当前 小数
        for (int i = numslist.size() - 1; i >= 0; i--) {
            //  从当前 小数(i) 向左遍历数组 ， j  指向 当前大数
            for (int j = i; j < numslist.size(); j++) {
                if (numslist.get(j) % numslist.get(i) == 0 && dp[i] < 1 + dp[j]) {
                    // if a[j] mod a[i] == 0, it means T[j] can form a larger subset by putting a[i] into T[j]
                    dp[i] = 1 + dp[j];
                    indexs[i] = j;

                    if (dp[i] > m) {
                        m = dp[i];
                        mi = i;
                    }
                }

            }
        }

        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < m; ++i) {
            ret.add(numslist.get(mi));
            mi = indexs[mi];
        }

        return ret;

    }



}
