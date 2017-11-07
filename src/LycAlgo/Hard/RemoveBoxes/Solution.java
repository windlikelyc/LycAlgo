package LycAlgo.Hard.RemoveBoxes;

import org.junit.Test;

public class Solution {

    public int removeBoxes(int[] nums){
        int[][][] d = new int[100][100][100];
        return dfs(nums, d, 0, nums.length - 1, 0);

    }

    public int dfs(int[] nums,int [][][] d , int l , int r , int k){
        if(l>r) return 0;
        if(d[l][r][k] != 0) return d[l][r][k];

        //first case
        while (r>l && nums[r] == nums[r-1]){
            r--;
            k++;
        }// r - > 3   k = 2
        d[l][r][k] = (k + 1) * (k + 1) + dfs(nums, d, l, r - 1, 0);

        //second case
        for(int i = l ; i < r ; i++) {
            if(nums[i] == nums[r]){
                d[l][r][k] = Math.max(d[l][r][k],
                        dfs(nums, d, i + 1, r - 1, 0)+ dfs(nums,d,l,i,k+1));
            }
        }
        return d[l][r][k];
    }

    @Test
    public void test(){
        removeBoxes(new int[]{1,2,1});
    }
}
