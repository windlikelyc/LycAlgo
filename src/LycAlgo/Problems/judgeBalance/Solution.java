package LycAlgo.Problems.judgeBalance;

import LycAlgo.utils.Tree.Tree;
import LycAlgo.utils.Tree.TreeNode;
import org.junit.Test;

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

    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        System.out.println(heigth(root));
    }
}
