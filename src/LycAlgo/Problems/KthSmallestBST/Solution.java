package LycAlgo.Problems.KthSmallestBST;

import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        return list.get(k-1);
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
        return;
    }
}
