package algorithm.Problems.addOneRowToTree;

import algorithm.utils.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    TreeNode addOneRow(TreeNode root, int v, int d) {
        if(root==null)
            return null;
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            if(--d == 0)
                return root;
            int n = q.size();
            for (int i=0;i<n;++i) {
                TreeNode t = q.poll();
                if (d == 1) {
                    TreeNode left = t.left;
                    TreeNode right = t.right;
                    t.left = new TreeNode(v);
                    t.right = new TreeNode(v);
                    t.left.left = left;
                    t.right.right = right;
                } else {
                    if (t.left != null) q.add(t.left);
                    if (t.right != null) q.add(t.right);
                }
            }
        }
        return root;
    }

    TreeNode addOneRowRecursive(TreeNode root, int v, int d) {
        if (d == 0 || d == 1) {
            TreeNode newRoot = new TreeNode(v);
            if (d != 0) {
                newRoot.left = root;
            } else {
                newRoot.right = root;
            }
            return newRoot;
        }
        if (root != null && d > 1) {
            root.left = addOneRowRecursive(root.left, v, d > 2 ? d - 1 : 1);
            root.right = addOneRowRecursive(root.right, v, d > 2 ? d - 1 : 0);
        }
        return root;
    }

}
