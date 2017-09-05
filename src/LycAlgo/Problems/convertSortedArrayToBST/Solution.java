package LycAlgo.Problems.convertSortedArrayToBST;

import LycAlgo.utils.Tree.TreeNode;

/**
 * Created by lyc on 2017/9/5.
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) return null;

        TreeNode root = helper(nums, 0, nums.length - 1);

        return root;

    }

    private TreeNode helper(int[] nums, int start, int end) {

        if (start <= end) {

            int mid = (start + end) / 2;

            TreeNode current = new TreeNode(nums[mid]);

            current.left = helper(nums, start, mid - 1);
            current.right = helper(nums, mid + 1, end);

            return current;

        }

        return null;

    }

}
