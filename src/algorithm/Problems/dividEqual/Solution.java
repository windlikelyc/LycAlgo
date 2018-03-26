package algorithm.Problems.dividEqual;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private boolean ans = false;
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int all = 0;
        for (int i : nums) {
            all += i;
        }

        if (all % 2 != 0) {
            return false;
        }


        backtrack(nums, 0, new ArrayList(),all/2,0);
        return ans;


    }

    private boolean backtrack(int[] nums, int start, List<Integer> list,int target,int cur) {

        if(cur > target){
            return false;
        }

        if(cur == target){
            ans = true;
        }

        for(int i= start ;  i < nums.length ; i++) {

            list.add(nums[i]);
            cur += nums[i];

            if(!ans){
                backtrack(nums, i + 1, list,target,cur);
            }else {
                return true;
            }

            list.remove(list.size() - 1);
            cur -= nums[i];

        }
        return false;

    }

}
