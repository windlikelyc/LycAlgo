package algorithm.maxAreaOfIsland;


/**
 * Created by lyc on 2017/11/20.
 */
public class Solution {

    private int top = 0;
    private int left = 0;
    private int bottom = 0;
    private int right = 0;
    private int[][] grid_copy = null;
    private boolean[][] visited = null;

    /**
     *         0   1   0
     *         1   1   0
     *         1   0   0
     *
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        init(grid);
        int max_of_island = 0;
        for(int i = 0 ; i < grid.length ; i ++) {
            for (int j = 0 ; j < grid[0].length ; j ++) {
                max_of_island = Math.max(updownleftright(i, j), max_of_island);
            }
        }
        return max_of_island;
    }

    private int updownleftright(int i, int j) {


        if(!(i>=top && i<= bottom)) return 0;
        if(!(j>=left && j<= right)) return 0;
        if(visited[i][j]) return 0;
        if (grid_copy[i][j] == 0) {
            return 0;
        }

        int now_area = 1;
        visited[i][j] = true;
        now_area += updownleftright(i + 1, j);
        now_area += updownleftright(i - 1, j);
        now_area += updownleftright(i, j + 1);
        now_area += updownleftright(i, j - 1);

        return now_area;
    }

    private void init(int[][] grid) {
        grid_copy = grid;
        bottom = grid.length -1;
        right = grid[0].length - 1;
        visited = new boolean[grid.length][grid[0].length];
    }

}
