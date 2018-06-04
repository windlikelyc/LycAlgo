package algorithm.Problems.PathSum;

/**
 * Created by lyc on 2017/11/20.
 */

import algorithm.utils.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *       10
        /  \
       5   -3
      / \    \
     3   2   11
    / \   \
   3  -2   1
 *
 */
public class Solution3 {
    private int nums = 0;
    private int sumTemp = 0;
    public int pathSum(TreeNode root, int sum) {

        sumTemp = sum;
        List<Integer> path = new ArrayList<>();
        helper(root,path);
        return nums;
    }

    private void helper(TreeNode nowNode, List<Integer> paths) {
        if (nowNode == null) {
            return;
        }

        // 将当期节点的值加入，将所有路径插入paths
        List<Integer> thispath = new ArrayList<>(paths);
        for (int i = 0; i < paths.size(); i++) {
            thispath.set(i, paths.get(i) + nowNode.val);
        }
        thispath.add(nowNode.val);  //[10]

        for (Integer i : thispath) {
            if (i == sumTemp) {
                nums++;
            }
        }

        helper(nowNode.left,thispath);
        helper(nowNode.right,thispath);
    }

}
