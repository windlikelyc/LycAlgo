package testAlgo.ch04.tools;

public class Tools {

    /**
     * 在O(logN) 取矩阵的次方
     * @param m 矩阵
     * @param p 阶数
     * @return
     */
    public static int[][] matrixPower(int[][] m, int p) {
        int[][] res = new int[m.length][m[0].length];
        for (int i =0 ; i < res.length ; i++) {
            res[i][i] = 1;
        }
        int[][] tmp = m;
        for(; p != 0; p >>= 1) {
            if ((p & 1) != 0) {
                res = muliMatrix(res, tmp);
            }
            tmp = muliMatrix(tmp, tmp);
        }
        return res;

    }

    public static int[][] muliMatrix(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for(int i = 0 ; i < b[0].length ; i++) {
            for(int j = 0 ; j < a.length ; j++) {
                for(int k = 0 ; k < b.length ; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
}
