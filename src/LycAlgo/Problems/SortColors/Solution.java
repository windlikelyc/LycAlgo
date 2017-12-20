package LycAlgo.Problems.SortColors;

import org.junit.Test;

/**
 * Created by lyc on 2017/11/17.
 */
public class Solution {
    // 0 1 2 2 1 0
    public void sortColors(int[] nums) {

        int min = 0;
        int max = nums.length -1;


        for(int i = 0 ; i <= max ; i++) { // i 是当前待移动下标
            if(nums[i] == 0 && i!=min){
                swap(i, min , nums);
                min++;
                i--;
            }
            if(nums[i] == 2 && i!=max){
                swap(i, max,  nums);
                max--;
                i--;
            }
        }
        return;
    }

    private void swap(int i, int s , int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[s];
        nums[s] = tmp;
    }

    @Test
    public void test() {
        sortColors(new int[]{1,2,0});
    }
}

