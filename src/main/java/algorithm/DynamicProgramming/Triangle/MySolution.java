package algorithm.DynamicProgramming.Triangle;

/**
 * Created by lyc on 2017/9/18.
 */

import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 **/
public class MySolution {

    public int minimumTotal(List<List<Integer>> triangle) {
        //dp存储最小元素下标
        // error:典型的贪心策略
//        if(triangle.size() == 0 ) return 0;
//        int ans = triangle.get(0).get(0);
//        int[] dp = new int[triangle.size()];
//        dp[0] = 0;
//        for(int i = 1 ; i < triangle.size() ; i++) {
//            int minIndex = dp[i - 1];
//            if (triangle.get(i).get(minIndex) < triangle.get(i).get(minIndex + 1)) {
//                ans += triangle.get(i).get(minIndex);
//                dp[i] = minIndex;
//            } else {
//                ans += triangle.get(i).get(minIndex + 1);
//                dp[i] = minIndex + 1;
//            }
//        }
//        return ans;

//        用动规只用O（N）的空间不会，容易想到用oN2的空间
        return 1;

    }
}
