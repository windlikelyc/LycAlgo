package LycAlgo.Greedy.SplitArray;

import org.junit.Test;

/**
 * Created by lyc on 2017/9/25.
 */

//You are given an integer array sorted in ascending order (may contain duplicates), you need to split them into several subsequences,
// where each subsequences consist of at least 3 consecutive integers. Return whether you can make such a split.
public class MySolution {

    public boolean isPossible(int[] nums) {
        //1,1,1,2,3,4,5,6
        int[] in = new int[nums.length];
        int min = Integer.MIN_VALUE;
        boolean over = false;
//        1,2,4

        return true;

    }

    @Test
    public void test() {
        isPossible(new int[]{1, 3, 3, 4, 5});
    }

}
