package algorithm.Problems.PathSum;

import algorithm.utils.Tree.TreeNode;

/**
 * Created by lyc on 2017/11/20.
 */


public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if (root.right == null && root.left == null && sum == root.val) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
