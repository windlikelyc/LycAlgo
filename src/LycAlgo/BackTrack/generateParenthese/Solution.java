package LycAlgo.BackTrack.generateParenthese;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/9/21.
 */
public class Solution {
    //生成所有可能的n对括号组合
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {

        if (str.length() == max * 2) {
            list.add(str);
            return;
        }


        //这里需要想的稍微细致一点。看起来连续的字符串是如何实现跃迁的
        //我们在进入递归函数的时候，传进来东西的前一秒要保存上一次的状态，
        //然而当返回去的时候，这个东西要被当时的场景复原。
        //这就有点像无记忆性时间倒退一样，完完全全回到当时的状态，好像没发生过过去到现在的事情一样。
        //另外栈上的数据没了就真没了，而过去的有的一直就有
        if (open < max)
            backtrack(list, str + "(", open + 1, close, max);
        if (close < open)
            backtrack(list, str + ")", open, close + 1, max);
    }
}
