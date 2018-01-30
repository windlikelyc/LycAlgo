package testAlgo.ch04.upstair;

import testAlgo.ch04.tools.Tools;

public class UpstairSolution {

    /**
     * O(2^N)
     * @param n
     * @return
     */
    public static int getUpN(int n) {
        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2) return n;

        return getUpN(n - 1) + getUpN(n - 2);
    }

    /**
     * O(N)
     * @param n
     * @return
     */
    public static int getUpN2(int n) {

        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2) return n;

        int a = 1;
        int b = 2;
        int c = 0;
        for (int i = 3; i <= n; i ++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int getUpN3(int n) {
        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2) return n;

        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = Tools.matrixPower(base, n - 2);
        return 2*res[0][0] + res[1][0];
    }

}
