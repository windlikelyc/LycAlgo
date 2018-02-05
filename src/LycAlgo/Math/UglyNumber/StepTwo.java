package LycAlgo.Math.UglyNumber;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

public class StepTwo {
    /**Write a program to find the n-th ugly number.
     Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
     For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
     **/

    /**
     *  (1) 1x2,  2x2, 2x2, 3x2, 3x2, 4x2, 5x2...
     (2) 1x3,  1x3, 2x3, 2x3, 2x3, 3x3, 3x3...
     (3) 1x5,  1x5, 1x5, 1x5, 2x5, 2x5, 2x5...
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int in2 = 0;
        int in3 = 0;
        int in5 = 0;
        while (ans.size() < n) {
            int tm2 = ans.get(in2) * 2;
            int tm3 = ans.get(in3) * 3;
            int tm5 = ans.get(in5) * 5;
            int min = Math.min(tm2, Math.min(tm3, tm5));
            if( min == tm2) in2++;
            if( min == tm3) in3++;
            if( min == tm5) in5++;
            ans.add(Integer.valueOf(min));
        }
        return ans.get(n - 1);
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        int[] inx = new int[primes.length];  //记住对于每一个素数的最小丑数下标
        int[] tmp = new int[primes.length];  //存放当前最小丑数用于比较
        while (ans.size() < n) {
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < primes.length ; i++) {
                tmp[i] = ans.get(inx[i]) * primes[i];
                if(tmp[i] <= min) min = tmp[i];
            }
            for(int j = 0 ; j < primes.length ; j++) {
                if(min == tmp[j]) inx[j]++;
            }
            ans.add(Integer.valueOf(min));
        }
        return ans.get(n-1);
    }


}
