package algorithm.Problems.subset;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        if(nums == null || nums.length == 0) return ans;
        Arrays.sort(nums);

        backtrack(0, nums, new ArrayList());

        return ans;
    }

    private void backtrack( int start , int[] nums , List list) {

        boolean isfirst = true;

        ans.add(new ArrayList<>(list));
        for(int i = start ; i < nums.length ; i ++) {

            if(isfirst || ( i > 0 && nums[i] != nums[i-1])){

                list.add(nums[i]);

                backtrack(i + 1 , nums , list);

                list.remove(list.size() - 1);

            }

            isfirst = false;


        }

    }

}
