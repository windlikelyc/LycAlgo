package algorithm.Problems.setMatrix0;


public class Solution {
    public void setZeroes(int[][] matrix) {

        int height = matrix.length;
        int longth = matrix[0].length;

        boolean[] signheight = new boolean[height];
        boolean[] signlongth = new boolean[longth];

        for(int i = 0 ; i < height ; i++){ // 按行遍历
            for( int j = 0 ; j < longth ; j++) {
                if( matrix[i][j] == 0){
                    signheight[i] = true;
                    break;
                }
            }
        }

        for(int j = 0 ; j < longth ; j++){ // 按列遍历
            for( int i = 0 ; i < height ; i++) {
                if( matrix[i][j] == 0){
                    signlongth[j] = true;
                    break;
                }
            }
        }

        //刷新矩阵行数
        for(int i = 0 ; i < height ; i++){
            if(signheight[i] == true){
                for(int j = 0 ; j < longth ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        // 刷新矩阵列
        for(int j = 0 ; j < longth ; j++){
            if(signlongth[j] == true){
                for(int i = 0 ; i < height ; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }


}
