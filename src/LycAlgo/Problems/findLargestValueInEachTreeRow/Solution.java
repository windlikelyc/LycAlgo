package LycAlgo.Problems.findLargestValueInEachTreeRow;

import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyc on 2017/9/5.
 */
public class Solution {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        //List不也是指针么，名字好听而已
        helper(root, res, 0);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res, int d) {
        if (root == null) {
            return;
        }

        //一个判断解决的事，非要用队列

        //expand list size
        if (d == res.size()) {
            res.add(root.val);
        } else {
            //or set value
            res.set(d, Math.max(res.get(d), root.val));
        }
        helper(root.left, res, d + 1);
        helper(root.right, res, d + 1);
    }

}
