package LycAlgo.Problems.deletStringForSame;


/**
 * Created by lyc on 2017/9/12.
 */
public class MySolution {

    //Given two words word1 and word2, find the minimum number of steps required to make word1 and word2 the same
    // , where in each step you can delete one character in either string.

    public int minDistance(String word1, String word2) {

        //初始化数组
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {

                //相当于一个字符和空字符作比较。比如's'和''的最长子序列，已经不能再退了，为0
                //安逸舒坦："Every thing should be make as simple as possible but not simpler
                if (i == 0 || j == 0) dp[i][j] = 0;
                else dp[i][j] = (
                        word1.charAt(i - 1) == word2.charAt(j - 1)) ?

                        //左上回退，相当去去掉两个相同字符，此时最长子序列+1
                        dp[i - 1][j - 1] + 1 :

                        //左回退和上回退。既然求最长子序列那么必定取两者回退后仍然是最长的序列，即max
                        Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        int val = dp[word1.length()][word2.length()];
        return word1.length() - val + word2.length() - val;
    }

    //动规的核心思想是把复杂的问题简单化
    //动规的手段是记录之前的成果
    //动规的开始是那个因为一目了然而无法简单的simpler

    //详见strDP.png


    /**
     *  典型的动态规划问题，基本思想是用On2双循环便利两个字符串
     *  如 apple  banana
     *
     *  刚开始 初始化下标为-1 的节点为0
     *
     *  然后如果相等就取↖节点并加一（为什么？）
     *  如果不等就去上左节点最大值
     *
     */

}
