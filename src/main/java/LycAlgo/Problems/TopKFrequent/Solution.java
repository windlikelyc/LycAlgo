package LycAlgo.Problems.TopKFrequent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> p = null;
            int max = -1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > max) {
                    p = entry;
                    max = p.getValue();
                }
            }
            l.add(p.getKey());
            map.remove(p.getKey());
        }
        return l;
    }
}
