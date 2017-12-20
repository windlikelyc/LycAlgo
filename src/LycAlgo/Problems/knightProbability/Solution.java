package LycAlgo.Problems.knightProbability;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/11/21.
 *
 */
public class Solution {
    private int[][] directions = {{-2,1},{-1,2},  //第一象限
            {1,2},{2,1},
            {1,-2},{2,-1},
            {-1,-2},{-2,-1}};
    private int top,down,left, right,allK,invalid,valid;
    public double knightProbability(int N, int K, int r, int c) {
        if(K==0) return Double.valueOf(1);
        top = 0;
        down = N-1;
        left = 0;
        right = N-1;
        allK = K;
        checknow(r, c , 0);
        return Double.valueOf(valid) / Math.pow (8.0,Double.valueOf(K));
    }
    private void checknow(int r, int c , int nums) {
        if(nums>=allK) return;
        int nowvaild = 0;
        for(int i = 0 ; i < directions.length ; i++) {
            int offsetX = directions[i][0];
            int offsetY = directions[i][1];

            if (r + offsetX < top || r + offsetX > down || c + offsetY < left || c + offsetY > right) {
                invalid++;
            }else {
                if(nums+1 == allK){
                    valid++;
                }
                checknow(r+offsetX,c+offsetY,nums+1);
            }
        }
    }

   @Test
    public void test(){
       System.out.print(knightProbability(8, 30, 6, 4));
   }
}
