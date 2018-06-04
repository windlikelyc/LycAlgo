package algorithm.Problems.FindKCloest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        Map<Integer, Integer> map = new HashMap<>();
        int mind = Integer.MAX_VALUE;

        boolean isfirst = true;

        for(int i =0;i < arr.length;i++) {
            map.put(Math.abs(arr[i] - x),i);
            mind = Math.min(mind, Math.abs(arr[i] - x));

            if (map.get(Math.abs(arr[i] - x)) != i) {
                break;
            }
        }

        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < k;i++) {
            l.add(arr[map.get(mind) + i]);
        }

        return l;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findClosestElements(new int[]{0,0,1,2,3,3,4,7,7,8}, 3, 5);
    }
}
