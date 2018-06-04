package algorithm.Problems.binaryTreePath;

import algorithm.utils.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        List<TreeNode> tmp = new ArrayList();
        preorder(root,tmp);

        return ans;


    }

    private void preorder(TreeNode root, List<TreeNode> tmp) {

        if (root == null) {
            return;
        }

        tmp.add(root);

        if (root.left != null) {
            preorder(root.left,tmp);
        }

        if (root.right != null) {
            preorder(root.right,tmp);
        }

        if (root.left == null && root.right == null) {
            ans.add(getliststring(tmp));
        }
        tmp.remove(tmp.size() - 1);

    }

    private String getliststring(List<TreeNode> tmp) {

        StringBuilder sb = new StringBuilder();

        for (TreeNode t : tmp) {
            sb.append(t.val);
            sb.append("->");
        }

        sb.delete(sb.lastIndexOf("->"), sb.capacity());

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.right = new TreeNode(4);

        System.out.println(  solution.binaryTreePaths(t));

    }

}
