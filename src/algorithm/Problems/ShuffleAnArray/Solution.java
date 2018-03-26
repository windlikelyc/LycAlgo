package algorithm.Problems.ShuffleAnArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lyc on 2017/10/13.
 */
public class Solution {
    List<Integer> list = new ArrayList<>();


    public Solution(int[] nums) {
        for (Integer i : nums) {
            list.add(i);
        }

    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        int[] reset_arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            reset_arr[i] = list.get(i);
        }
        return reset_arr;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] shuffle_arr = new int[list.size()];
        List<Integer> tmp = new ArrayList<>(list);
        Random random = new Random();
        int i = 0;
        while (!tmp.isEmpty()) {
            int index = random.nextInt(tmp.size());
            shuffle_arr[i++] = tmp.get(index);
            tmp.remove(new Integer(tmp.get(index)));
        }
        return shuffle_arr;
    }


}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */