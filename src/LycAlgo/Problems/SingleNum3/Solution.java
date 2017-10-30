package LycAlgo.Problems.SingleNum3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }else {
                map.remove(nums[i]);
            }
        }
        int[] ans = new int[map.size()];
        int j = 0;
        for (Integer key : map.keySet()) {
            ans[j++] = key;
        }
        return ans;
    }

    @Test
    public void test(){
        singleNumber(new int[]{1, 1, 2, 2, 3, 5});
    }
}
