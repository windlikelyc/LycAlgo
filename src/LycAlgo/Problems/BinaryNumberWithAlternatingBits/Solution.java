package LycAlgo.Problems.BinaryNumberWithAlternatingBits;

import org.junit.Test;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        int thisbit = n & 1;
        while (n != 0) {
            n >>= 1;
            int next = n & 1;
            if((thisbit ^ next) == 0){
                return false;
            }
            thisbit = next;
        }
        return true;
    }

    @Test
    public void tes(){
        System.out.println(hasAlternatingBits(10));
    }
}
