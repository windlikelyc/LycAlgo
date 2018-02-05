package LycAlgo.Problems.longestSubstring.mask;


public class Solution {
    public int longestSubstring(String s, int k) {
        int res = 0, i = 0, n = s.length();
        while (i + k <= n) {
            int[] m = new int[26];
            int mask = 0, max_idx = i;
            for (int j = i; j < n; ++j) {
                int t = s.charAt(j) - 'a';
                ++m[t];
                if (m[t] < k) mask |= (1 << t);
                else mask &= (~(1 << t));
                if (mask == 0) {
                    res = Math.max(res, j - i + 1);
                    max_idx = j;
                }
            }
            i = max_idx + 1;
        }
        return res;
    }

}
