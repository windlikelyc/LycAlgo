package LycAlgo.Problems.countTriangle;

import org.junit.Test;

/**
 * Created by lyc on 2017/9/5.
 */

//给定一个整数数组，在该数组中，寻找三个数，分别代表三角形三条边的长度，问，可以寻找到多少组这样的三个数来组成三角形？
public class MySolution {
    /*
    * @param S: A list of integers
    * @return: An integer
    */
    public int triangleCount(int[] S) {
        // write your code here
        // 可以使用暴力法，每次选出三个数，传入判断函数内
        // 随机选两个数字，如5,9，则  4<x<14 都可以组成三角形 复杂度On3，估计会TLE
        int ans = 0;
        for (int i = 0; i < S.length; i++) {
            for (int j = i + 1; j < S.length; j++) {
                for (int k = j + 1; k < S.length; k++) {
                    int max = Math.max(S[i], S[j]);
                    int min = Math.min(S[i], S[j]);

                    if (max - min < S[k] && S[k] < max + min) {
                        ans++;
                    }
                }
            }

        }
        return ans;
    }

    @Test
    public void test() {
        int nums[] = new int[]{3, 4, 6, 7};
        triangleCount(nums);

    }


}
