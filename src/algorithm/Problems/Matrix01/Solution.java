package algorithm.Problems.Matrix01;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  //  bfs
  public int[][] updateMatrix2(int[][] matrix) {
    int[][] dp = new int[matrix.length][matrix[0].length];
    if(dp.length == 0 || dp[0].length == 0) return dp;
    int rows = matrix.length;
    int cols = matrix[0].length;
    Queue<int[]> q = new LinkedList<>();
    for(int i = 0 ; i < rows ; i++) {
      for(int j = 0 ; j < cols ; j++) {
        if (matrix[i][j] == 0) {
          // 入队
          q.offer(new int[]{i, j});
        }else {
          matrix[i][j] = Integer.MAX_VALUE;
        }
      }
    }

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    while (!q.isEmpty()) {
      int cell[] = q.poll();
      for(int[] d:dirs){
        int r = cell[0] + d[0];
        int c = cell[1] + d[1];
        if(r >= 0 && c>=0 && r<rows && c<cols){
          if (matrix[r][c] > matrix[cell[0]][cell[1]]+1) {
            matrix[r][c] = matrix[cell[0]][cell[1]]+1;
            q.offer(new int[]{r, c});
//            LycAlgo.utils.martrix.martrix.show(matrix);
          }
        }

      }
    }
    return matrix;
  }

  //AC DFS 99%
  public int[][] updateMatrix(int[][] matrix) {
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[0].length; j++) {
        if(matrix[i][j]!=0) {
          dfs(matrix, i, j);
        }
      }
    }
    return matrix;
  }

  int[] dx = {-1,0,1,0};
  int[] dy = {0,-1,0,1};

  void dfs(int[][] matrix, int r, int c) {
    int min = Integer.MAX_VALUE;
    for(int i = 0; i< 4; i++) {
      int x = r+dx[i];
      int y = c+dy[i];
      if(x>=0 && x<matrix.length && y>=0 && y<matrix[0].length) {//valid
        min = Math.min(min, matrix[x][y]+1);
      }
    }
    if(min != matrix[r][c]) { //dif
      matrix[r][c] = min;

      for(int i = 0; i< 4; i++) {
        int x = r+dx[i];
        int y = c+dy[i];
        if(x>=0 && x<matrix.length && y>=0 && y<matrix[0].length) {
          dfs(matrix,x,y);//re do it!!!
        }
      }
    }
    System.out.println("drop done");
  }


}
