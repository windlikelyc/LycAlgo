package algorithm.Problems.WordSearch;


public class Solution {

    private int maxlength;
    private boolean ans = false;
    private boolean[][] isVisited;

    public boolean exist(char[][] board, String word) {

        int wordIndex = 0;
        maxlength = word.length();
        isVisited = new boolean[board.length][board[0].length];

        for(int i = 0 ; i < board.length ; i ++) {
            for(int j = 0 ; j < board[0].length ; j ++) {

                findthis(wordIndex, i, j, board,word);

            }
        }
        return ans;
    }

    private void findthis(int wordIndex, int i, int j,char[][] board,String word) {


        if(wordIndex == maxlength) {
            ans = true;
            return;
        }

        if(i < 0 || i > board.length-1) return;
        if(j < 0 || j > board[0].length-1) return;

        if(!isVisited[i][j] && board[i][j] == word.charAt(wordIndex)){

            isVisited[i][j] = true;

            if(!ans)findthis(wordIndex+1,i+1,j,board,word);
            if(!ans)findthis(wordIndex+1,i-1,j,board,word);
            if(!ans)findthis(wordIndex+1,i,j+1,board,word);
            if(!ans)findthis(wordIndex+1,i,j-1,board,word);

            isVisited[i][j] = false;

        }else return;

    }

}
