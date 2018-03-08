package LycAlgo.Problems.PathSum2;

import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        preOrder(root, sum, new ArrayList<Integer>());
        return ans;

    }

    private void preOrder(TreeNode root, int lefter, ArrayList<Integer> integers) {

        if ( root == null || lefter - root.val < 0 ) {
            return;
        }
        integers.add(root.val);
        if (lefter - root.val == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<Integer>(integers));
        }

        preOrder(root.left, lefter - root.val, integers);
        preOrder(root.right, lefter - root.val, integers);
        integers.remove(integers.size() - 1);
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        TreeNode t = new TreeBuilder(-2).right(-3).get();

        solution.pathSum(t,-5);
    }

}
