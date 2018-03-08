package LycAlgo.Problems.CountCompleteTreeNode;

import LycAlgo.utils.Tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private Set<TreeNode> set = new HashSet<>();
    public int countNodes(TreeNode root) {

        preorder(root);
        return set.size();

    }

    private void preorder(TreeNode root) {

        if (root == null) {
            return;
        }
        set.add(root);
        preorder(root.left);
        preorder(root.right);
    }


}
