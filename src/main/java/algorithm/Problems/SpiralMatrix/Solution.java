package algorithm.Problems.SpiralMatrix;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    private  int m;
    private int n;
    private int[][] copy;
    private int[][] dirctions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int thisdirection = 0;
    private int alreadycount = 0;

    private List<Integer> list = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        m = matrix.length;
        if(m == 0) return list;
        n = matrix[0].length;

        copy = new int[m][n];
        int x = 0;
        int y = 0;

        int[] now = dirctions[thisdirection];
        while (!(m * n == alreadycount)) {
            while (x >= 0 && x < m && y >= 0 && y < n && copy[x][y] == 0) {
                copy[x][y] = 1;
                list.add(matrix[x][y]);
                alreadycount++;
                x = x + now[0];
                y = y + now[1];
            }
            x -= now[0];
            y -= now[1];
            thisdirection = (thisdirection + 1) % 4;
            now = dirctions[thisdirection];
            x = x + now[0];
            y = y + now[1];

        }
        return list;
    }




}
