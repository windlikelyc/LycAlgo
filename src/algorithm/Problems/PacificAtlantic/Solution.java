package algorithm.Problems.PacificAtlantic;


import java.util.ArrayList;
import java.util.List;

public class Solution {

  int rows = 0;
  int cols = 0;

  int[][] lock;
  int[][] directions = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, 1}};



  public List<int[]> pacificAtlantic(int[][] matrix) {

    rows = matrix.length;
    cols = matrix[0].length;

    lock = new int[rows][cols];

    // 0 可使用 1 已占用 2 可流入 3 不可流入
    List<int[]> l = new ArrayList<>();
    for(int i = 0 ; i < matrix.length ; i++) {
      for(int j = 0 ; j < matrix[0].length ; j++) {
        //求所有流入右和下的节点
        judge(i, j, matrix);
      }
    }
    return null;

  }

  private boolean judge(int i, int j, int[][] matrix) {

    if(i == rows || j == cols ){
      return true;
    }

    for(int k = 0 ; k < 4 ; k++) {


      if (i+directions[k][0]>=0 &&i+directions[k][0]<rows && j+directions[k][1]>=0&&j+directions[k][1]<cols){

        if(lock[i + directions[k][0]][j + directions[k][1]] == 1){
          continue;
        }
        lock[i][j] = 1;
        if(judge(i + directions[k][0], j + directions[k][1], matrix)){
          lock[i][j] = 2;
        }
      }
    }
    lock[i][j] = 0;

    if(lock[i][j] != 2){
      lock[i][j] = 3;
    }

    return false;
  }



}
