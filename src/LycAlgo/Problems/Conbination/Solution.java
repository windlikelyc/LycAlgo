package LycAlgo.Problems.Conbination;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> combine(int n, int k) {

    int[] nums = new int[n];
    for(int i = 0 ; i < n ; i++) {
      nums[i] = i + 1;
    }
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> l = new ArrayList<>();

    backtrack(0,nums,l,k,ans);

    return ans;
  }

  private void backtrack(int start, int[] nums, List<Integer> l, int remaink, List<List<Integer>> ans) {
    if(remaink == 0) {
      ans.add(new ArrayList<>(l));
      return;
    }
    for(int i = start ; i < nums.length ; i++) {
      l.add(nums[i]);
      backtrack(i+1, nums, l , remaink-1,ans);
      l.remove(l.size() - 1);
    }
  }

}
