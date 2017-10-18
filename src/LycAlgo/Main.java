package LycAlgo;

import LycAlgo.Problems.ShuffleAnArray.Solution;

import java.util.Arrays;

/**
 * Created by lyc on 2017/9/6.
 */

/**
 * 难道国内的算算法题已经这么简单了吗？
 * 还有这种手动IO的？
 * 出自牛客网，瞎写的
 */
public class Main {

   // say hello
    public static void main(String[] args) {
        Solution solution = new Solution(new int[]{1, 2, 3, 4, 5});
        int i = 10;
        while (i-- != 0) {
            System.out.println(Arrays.toString(solution.shuffle()));
        }
        System.out.println("----------" + Arrays.toString(solution.reset()));
    }
}
