package LycAlgo.DynamicProgramming.isSubstr;

/**
 * Created by lyc on 2017/9/28.
 */
public class MySolution {
    //看不出哪里有dp的事
    //given two strings s t.check whether s is subsequence of t
    boolean isSubseq(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }
        int m = 0, n = 0;
        while (m < s.length() && n < t.length()) {

            if (s.charAt(m) != t.charAt(n)) {
                n++;
            } else {
                m++;
                n++;
            }

            if (n == t.length() && m < s.length()) {
                return false;
            }

        }

        return true;
    }
}



