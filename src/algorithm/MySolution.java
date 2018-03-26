package algorithm;


import java.util.HashSet;

/**
 * Created by lyc on 2017/9/5.
 */
public class MySolution {

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
