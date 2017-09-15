package LycAlgo;

import LycAlgo.utils.lString.lString;
import org.junit.Test;

/**
 * Created by lyc on 2017/9/5.
 */
public class MySolution {

    @Test
    public void test() {

        Character.isLetterOrDigit('a');

        Character.toLowerCase('a');

        System.out.print(lString.StringToInt("liuyaochen"));

    }

    class Solution {
        public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

            int x = 0;
            int y = 0;


            x += p1[0];
            x += p2[0];
            x += p3[0];
            x += p4[0];

            y += p1[1];
            y += p2[1];
            y += p3[1];
            y += p4[1];

            return x == y;


        }
    }
}
