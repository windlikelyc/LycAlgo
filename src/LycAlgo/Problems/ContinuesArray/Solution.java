package LycAlgo.Problems.ContinuesArray;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {

        public int findMaxLength(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) nums[i] = -1;
            }

            Map<Integer, Integer> sumToIndex = new HashMap<>();
            sumToIndex.put(0, -1);
            int sum = 0, max = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sumToIndex.containsKey(sum)) {
                    max = Math.max(max, i - sumToIndex.get(sum));
                }
                else {
                    sumToIndex.put(sum, i);
                }
            }

            return max;
        }

        @Test
        public void test(){
            findMaxLength(new int[]{0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1});
        }

}
