package testAlgo.ch04.fibblenaqi;


import testAlgo.ch04.tools.Tools;

// 求飞播纳妾数列第n向
public class FiboSolution {

    /**
     * O(2^N)
     * @param n
     * @return
     */
    public static int getFibboN(int n) {
        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2) return 1;

        return getFibboN(n - 1) + getFibboN(n - 2);
    }

    /**
     * O(N)
     * @param n
     * @return
     */
    public static int getFibboN2(int n) {

        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2) return 1;

        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i ++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int getFibboN3(int n) {
        if(n<1) {
            return 0;
        }
        if(n== 1||n == 2) return 1;

        int[][] base = {{1, 1}, {1, 0}};
        int[][] res = Tools.matrixPower(base, n - 2);
        return res[0][0] + res[1][0];
    }




}
