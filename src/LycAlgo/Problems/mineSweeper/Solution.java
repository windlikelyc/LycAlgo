package LycAlgo.Problems.mineSweeper;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  int[] d_x = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};
  int[] d_y = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
  public char[][] updateBoard(char[][] board, int[] click) {
    Queue<int[]> queue = new LinkedList<>();
    if (board[click[0]][click[1]] == 'E') {
      queue.add(new int[]{click[0], click[1]});
      while (!queue.isEmpty()) {
        int[] cell = queue.poll();
        char pre = board[cell[0]][cell[1]];
        int numOfthunder = 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 0 ; i < 8 ; i++) {
          int r = cell[0] + d_x[i];
          int c = cell[1] + d_y[i];
          if( r < 0 || r > board.length - 1 || c < 0 || c > board[0].length  - 1)  {
            continue;
          }else {
             if(board[r][c] == 'M'){  //周围有M
              numOfthunder++;
            }else {
               if (board[r][c] == 'E') {

                 list.add(new int[]{r, c});
               }
             }
          }
        }
        if(numOfthunder == 0){
          for(int[] t : list){
            board[t[0]][t[1]] = 'B';
            queue.offer(t);
          }
          board[cell[0]][cell[1]] = 'B';
        }else{
          board[cell[0]][cell[1]] = (char) (numOfthunder + '0');
        }
      }
    }else{
      board[click[0]][click[1]] = 'X';
    }// 1 - 4 - 3 - 2 - 5 - 2
    return board;
  }



}
