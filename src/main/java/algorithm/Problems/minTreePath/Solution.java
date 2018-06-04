package algorithm.Problems.minTreePath;

import algorithm.utils.Tree.TreeNode;

public class Solution {

    private int allmin = 10000;
    public int minDepth(TreeNode root) {

      minDepthwithDep(root, 1);
        return allmin;

    }

    private void minDepthwithDep(TreeNode root, int dep) {

        if(root.left == null && root.right == null){
            allmin = Math.min(allmin, dep);
            return;
        }

        if(root.left != null){
            minDepthwithDep(root.left, dep + 1);
        }
        if(root.right != null){

            minDepthwithDep(root.right, dep + 1);
        }
    }
}
