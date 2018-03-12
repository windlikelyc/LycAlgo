package LycAlgo.Problems.UniqueBST;

public class Solution {

    public int numTrees(int n) {
        int[] kartlans = new int[n + 2];
        kartlans[0] = 1;
        kartlans[1] = 1;
        for(int i = 2 ; i <= n ; i++ ) {
            int tmp = 0;
            for(int j = 1 ; j <= i ; j++ ) { // j 是打头下标
                tmp += kartlans[j - 1] * kartlans[i - j]; //
            }
            kartlans[i] = tmp;

        }
        return kartlans[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = solution.numTrees(3);
        System.out.println(a);
    }

}
