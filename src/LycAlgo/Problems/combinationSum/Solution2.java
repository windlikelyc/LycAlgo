package LycAlgo.Problems.combinationSum;

import com.sleepycat.je.tree.IN;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        helper(0, target,candidates , new ArrayList());
        return ans;

    }

    private void helper(int start , int remainTarget , int[] candidates ,List list) {

        if(remainTarget < 0) return;
        if (remainTarget == 0) {
            ans.add(new ArrayList(list));
            return;
        }
        for(int i = start ; i < candidates.length ; i++) {

            list.add(candidates[i]);
            helper(i,remainTarget-candidates[i],candidates,list);
            list.remove(list.size() - 1);

        }

    }

    @Test
    public void test(){
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}
