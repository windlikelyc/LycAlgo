package LycAlgo.Problems.ReverseTree;

import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;

public class Solution {

    public TreeNode reverser(TreeNode t) {

        if (t == null) {
            return null;
        }

        TreeNode tmp = reverser(t.left);
        t.left = reverser(t.right);
        t.right = tmp;

        return t;
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        TreeNode y = solution.reverser(TreeBuilder.getDefaultFullTree());
        System.out.println(y.toString2());
    }


}
