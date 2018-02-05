package LycAlgo.Problems.Permunation2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/11/9.
 */
public class Solution {

    List<Integer> allnums = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    // 1 ,2 ,3
    public List<List<Integer>> permuteUnique(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++) {
            allnums.add(nums[i]);
        }
        //下标数组，0为未使用，1为已使用
        int[] index = new int[nums.length];
        List<Integer> list = new ArrayList();
        fillthislist(list, allnums,nums,index);
        return ans;
    }

    private void fillthislist(List<Integer> nowlist, List<Integer> allnums,int[] nums,int[] index) {

        if(nowlist.size() == nums.length){
            ans.add(new ArrayList<Integer>(nowlist));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++) {
            if(index[i] == 1){
                continue;
            }
            nowlist.add(nums[i]);
            index[i] = 1;
            fillthislist(nowlist, allnums,nums,index);
            index[i] = 0;
            nowlist.remove(nums[i]);
        }
    }

}
