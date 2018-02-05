package LycAlgo.BackTrack.NQueen;


/**
 * Created by lyc on 2017/9/14.
 */
public class MySolution {

    int[][] chess = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
    };

    /**
     * 既然第一列只能放一个queen、
     * 那么遍历第一列所有位置看是否可行即可
     * 入口函数看输出
     */
    public void find(int dijilie) {
        int ans = 0;
        for (int i = 0; i < 4; i++) {

            if (judge(i, dijilie) == true) {

            }


        }


    }

    /**
     * @return
     */
    public boolean findQueens(int j) {

        return false;

    }

    /**
     * 如果碰到已经是是1的节点返回false
     * 否则返回true
     *
     * @param ini 横标
     * @param inj 纵标
     * @return
     */
    private boolean judge(int ini, int inj) {


        for (int j = 0; j < 4; j++) {
            if (chess[ini][j] == 0) {
                return false;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (chess[i][inj] == 1) {
                return false;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (chess[i][inj] == 1) {
                return false;
            }
        }
        for (int d1 = ini + 1, d2 = inj + 1; d1 + 1 > 0 && d1 < 4 && d2 > 0 && d2 < 4; ) {
            if (chess[d1][d2] == 1) return false;
            else {

                d1 += 1;
                d2 += 1;
            }
        }
        for (int d1 = ini + 1, d2 = inj - 1; d1 + 1 > 0 && d1 < 4 && d2 > 0 && d2 < 4; ) {
            if (chess[d1][d2] == 1) return false;
            else {

                d1 += 1;
                d2 -= 1;
            }
        }
        for (int d1 = ini - 1, d2 = inj + 1; d1 + 1 > 0 && d1 < 4 && d2 > 0 && d2 < 4; ) {
            if (chess[d1][d2] == 1) return false;
            else {

                d1 -= 1;
                d2 += 1;
            }
        }
        for (int d1 = ini - 1, d2 = inj - 1; d1 + 1 > 0 && d1 < 4 && d2 > 0 && d2 < 4; ) {
            if (chess[d1][d2] == 1) return false;
            else {

                d1 -= 1;
                d2 -= 1;
            }
        }
        return true;
    }


}
