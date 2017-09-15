package LycAlgo;

import LycAlgo.utils.lArray.CircleArray;

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
//    public static int test(String s) {
//        int l = s.length();
//        int maxl = -1;
//        int currentl = 1;
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) != s.charAt(i - 1)) {
//                currentl++;
//            } else {
//                maxl = Math.max(maxl, currentl);
//                currentl = 1;
//            }
//        }
//
//        return maxl;
//
//
//    }

    public static void main(String[] args) {
        CircleArray c = new CircleArray(new int[]{1, 2, 3, 4});
        System.out.print(Arrays.toString(c.getCircleArray()));

    }
}
