package algorithm.Problems.judgeBalance;

import algorithm.utils.Tree.TreeNode;

public class Solution {
    boolean isAllTreeBalance = true;
    public boolean isBalanced(TreeNode root) {

        heigth(root);

        return isAllTreeBalance;

    }

    public int heigth(TreeNode node) {

        if(node == null ){
            return 0;
        }

        int l = heigth(node.left);
        int r = heigth(node.right);

        if (Math.abs(l - r) > 2) {
            isAllTreeBalance = false;
        }

        return Math.max(l,r)+1;

    }


}
