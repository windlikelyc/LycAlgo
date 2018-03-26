package algorithm.backtrack.combination;


import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    private List<List<Integer>> ans = new ArrayList<>();
    private Integer wanted = 0;

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9} ;
        wanted = n;
        helper(nums, 0, 0, k,new ArrayList<>());
        return ans;
    }

    private void helper(int[] nums, int start, int sum, int k , List<Integer> l) {
        if (sum > wanted || k < 0 ) {
            return;
        }
        if(sum == wanted&&k==0){
            ans.add(new ArrayList<>(l));
        }
        for(int i = start ; i < nums.length && nums[i]+sum <= wanted; i++) {
            l.add(nums[i]);
            helper(nums, i + 1, sum+nums[i], k - 1, l);
            l.remove(Integer.valueOf(nums[i]));
        }
    }

}
