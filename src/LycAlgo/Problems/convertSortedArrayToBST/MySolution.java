package LycAlgo.Problems.convertSortedArrayToBST;
// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

import LycAlgo.utils.Tree.TreeNode;

/**
 * Created by lyc on 2017/9/5.
 */
public class MySolution {

    public TreeNode sortedArrayToBST(int[] nums) {

        //数组没判空


        //可以合并到下面
        TreeNode t = new TreeNode(nums[nums.length / 2]);

        t.left = generateRoot(nums, 0, nums.length / 2 - 1);
        t.right = generateRoot(nums, nums.length / 2, nums.length);

        return t;

    }

    private TreeNode generateRoot(int[] nums, int start, int end) {
        if (start >= end) return null;

        /**
         *  最大的问题是此处应该是加，不该是减
         *  一味的依赖debug没有大局观只能看到局部，从而失去大局
         */
        int mid = (end - start) / 2;
        TreeNode t = new TreeNode(nums[mid]);

        t.left = generateRoot(nums, start, mid - 1);
        t.right = generateRoot(nums, mid, end);

        return t;
    }


}
