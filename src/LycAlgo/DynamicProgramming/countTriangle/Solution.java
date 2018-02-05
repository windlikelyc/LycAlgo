package LycAlgo.DynamicProgramming.countTriangle;


import java.util.Arrays;

/**
 * Created by lyc on 2017/9/5.
 */
public class Solution {
    /**
     * 看的别人答案，先把数组进行排序，然后用大下标减去小下标一下子就可以加入很多答案。
     * 启发：很明显不能一个一个的数，这是大忌
     */
    public int triangleCount(int[] S) {
        if (S.length < 3) return 0;
        int ans = 0;
        Arrays.sort(S);
        for (int i = 2; i < S.length; i++) {

            int start = 0;
            int end = i - 1;
            while (start < end) {

                if (S[i] - S[end] >= S[start]) {
                    start++;
                } else {
                    ans += end - start;
                    end--;
                }

            }

        }
        return ans;
    }


}
