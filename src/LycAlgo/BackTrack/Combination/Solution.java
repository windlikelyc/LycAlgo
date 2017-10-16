package LycAlgo.BackTrack.Combination;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/10/16.
 */
public class Solution {
    int count = 0;
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        //                               ↓这地方太坑了，直接按指针加的
        backtrack(candidates, target, 0, new ArrayList<Integer>());

        return ans;

    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> tmp) {

        if (target == 0) {
            ans.add(new ArrayList<Integer>(tmp));
            return;
        }

        if (target < 0) {
            return;
        }
        //           ↓注意从这开始
        for (int i = start; i < candidates.length; i++) {

            tmp.add(new Integer(candidates[i]));
            count++;
            backtrack(candidates, target - candidates[i], i, tmp);
            tmp.remove(new Integer(candidates[i]));

        }

    }

    @Test
    public void test() {
        System.out.print(combinationSum(new int[]{1, 2, 3, 4, 5}, 5) + "count 是" + count);

    }


}
