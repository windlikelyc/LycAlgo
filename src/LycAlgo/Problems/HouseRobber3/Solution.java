package LycAlgo.Problems.HouseRobber3;

import LycAlgo.utils.Tree.TreeNode;

public class Solution {
    public int rob(TreeNode root) {

        if(root == null ) return 0;

        return getMoney(root);

    }

    private int getMoney(TreeNode root) {

        int m = root.val;
        int n = 0;
        if (root.left != null){
            n += getMoney(root.left);
        }

        if (root.right != null) {
            n += getMoney(root.right);
        }

        return Math.max(m, n);

    }
}
