package LycAlgo.utils.martrix;

/**
 * Created by lyc on 2017/10/11.
 */
public class martrix {
    /**
     * @param a 二为矩阵
     */
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
}
