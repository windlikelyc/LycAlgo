package LycAlgo.utils.RandomGenerator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by lyc on 2017/9/15.
 */
public class RandomGenerator {

    public static String gerate(int count) {

        Random random = new Random();

        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {

            ans[i] = random.nextInt(10);

        }

        return Arrays.toString(ans);

    }


    @Test
    public void test() {

        System.out.print(gerate(10));
    }
}
