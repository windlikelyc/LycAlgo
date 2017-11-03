package LycAlgo.Problems.brickWall;

import java.util.List;

/**
 * Created by lyc on 2017/10/24.
 */
public class Solution {
    public static void show(int[][] a) {
        int m = a.length;
        int n = a[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("------------------------------------万恶分割线-------------------------------------------");
    }

    public static int countminZeroPerCol(int[][] a) {
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < a[0].length; i++) {
            int zeros = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] == 0) zeros++;
            }
            System.out.println("the zeros in col " + i + " is " + zeros);
            min = Math.min(min, zeros);
        }
        return min;
    }

    public int leastBricks(List<List<Integer>> wall) {
        int width = 0;
        int height = wall.size();
        for (int i = 0; i < wall.get(0).size(); i++) {
            width += wall.get(0).get(i);
        }

        int[][] thecut = new int[height][width + 1];


        for (int i = 0; i < wall.size(); i++) {
            int temp = 0;
            for (int j = 0; j < wall.get(i).size() + 1; j++) {
                temp += wall.get(i).get(j);
                if (temp < width) thecut[i][temp] = 1;
            }
        }

        show(thecut);
        return countminZeroPerCol(thecut);
    }


}
