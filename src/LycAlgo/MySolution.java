package LycAlgo;

import org.junit.Test;

import java.util.HashSet;

/**
 * Created by lyc on 2017/9/5.
 */
public class MySolution {

    @Test
    public void test() {
        Solution s = new Solution();
        s.checkPerfectNumber(400000000);


    }

    class Solution {
        public boolean checkPerfectNumber(int num) {

            int half = num / 2;
            HashSet<Integer> set = new HashSet();
            for (int i = 1; i <= half; i++) {
                if (num % i == 0) set.add(i);
            }

            return set.stream().mapToInt(o -> {
                return o.intValue();
            }).sum() == num;

        }
    }
}
