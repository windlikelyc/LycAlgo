package algorithm.Problems.BinaryNumberWithAlternatingBits;


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


}
