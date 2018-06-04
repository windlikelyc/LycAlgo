package testAlgo.ch04.cow;

import testAlgo.ch04.tools.Tools;

public class CowSoulution {

    /**
     * O(2^N)
     * @param n
     * @return
     */
    public static int getCowN(int n) {
        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2 || n == 3 ) return n;

        return getCowN(n - 1) + getCowN(n - 3);
    }

    /**
     * O(N)
     * @param n
     * @return
     */
    public static int getCowN2(int n) {

        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2 || n == 3) return n;

        int res = 3;
        int pre = 2;
        int prepre = 1;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 4; i <= n; i ++) {
            tmp1 = res;
            tmp2 = pre;
            res = res + prepre;
            pre = tmp1;
            prepre = tmp2;
        }
        return res;
    }

    public static int getCowN3(int n) {
        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2 || n==3) return n;

        int[][] base = {{1, 1, 0}, {0, 0, 1}, {1, 0, 0}};
        int[][] res = Tools.matrixPower(base, n - 3);
        return 3 * res[0][0] + 2 * res[1][0] + res[2][0];
    }
}
