package algorithm.backtrack.mouseRun;


/**
 * Created by lyc on 2017/9/13.
 */
public class MySolution {

    /**
     * 老鼠走迷宫，从二维数组左上开始走到右下
     * 1代表有路
     * 0代表没路
     * 只能往左或往下走
     */

    int[][] mar = {
            {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1},
    };

    int i = 0;
    int j = 0;


    public void mouserun(int i, int j) {

        if (i == 3 && j == 3) System.out.print("蛤蛤");
        if (i + 1 < 4 && mar[i + 1][j] == 1) {

            System.out.print("D");
            mouserun(i + 1, j);


        }

        if (j + 1 < 4 && mar[i][j + 1] == 1) {

            System.out.print("R");
            mouserun(i, j + 1);

        }

    }

}
