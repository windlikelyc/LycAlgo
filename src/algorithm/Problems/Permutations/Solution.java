package algorithm.Problems.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1,2,3}));
    }

    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cup = new ArrayList<>();
        int[] mask = new int[nums.length];
        backtrack(nums, cup, 0,mask);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> cup, int i,int [] mask) {

        if(cup.size() == nums.length){
            ans.add(new ArrayList<>(cup));
            return;
        }

        for(int begin  = 0 ; begin < nums.length ; begin++  ) {
            if(mask[begin]==1) continue;
            mask[begin] =1;
            cup.add(nums[begin]);
            backtrack(nums,cup,i,mask);
            cup.remove(cup.size() - 1);
            mask[begin] = 0;
        }

    }


}
