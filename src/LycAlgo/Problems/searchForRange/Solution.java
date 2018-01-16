package LycAlgo.Problems.searchForRange;

import org.junit.Test;

public class Solution {
    public int[] searchRange(int[] nums, int target) {

        int lo = 0;
        int hi = nums.length - 1;
        int[] ans = new int[]{-1,-1};
        if(nums.length == 0) return ans;
        while (lo < hi && lo >=0 && hi < nums.length ) {

            int mid = (lo + hi) / 2;
            if (nums[mid] < target ) {
                lo = mid + 1;

            }else if(nums[mid] > target){
                hi = mid - 1;
            }else {
                hi = mid;
            }
        }

        if(nums[lo] == target){
            ans[0] = lo;
        }else {
            return ans;
        }

        lo = 0;
        hi = nums.length - 1;

        while (lo <= hi ) {

            int mid = (lo + hi) / 2;
            if (nums[mid] <= target ) {
                lo = mid + 1 ;
            }else {
                hi = mid - 1;
            }
        }
        ans[1] = lo-1;
        return ans;
    }
    @Test
    public void test(){
        searchRange(new int[]{5},5);
    }
}
