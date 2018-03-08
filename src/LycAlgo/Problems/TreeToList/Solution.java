package LycAlgo.Problems.TreeToList;

import LycAlgo.utils.Tree.Tree;
import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        TreeNode temp = root.left;
        while (temp != null && temp.right != null) {
            temp = temp.right;
        }

        flatten(root.right);
        if (temp != null) {
            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        TreeNode t = TreeBuilder.getDefaultFullTree();
        solution.flatten(t);
        System.out.println(t.toString2());

    }
}
