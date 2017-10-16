package LycAlgo;


import LycAlgo.utils.Tree.TreeNode;

import java.util.Stack;

/**
 * Created by lyc on 2017/9/5.
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        TreeNode c = root;
        while (c != null) {
            stack.push(c);
            c = c.left;
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode t = stack.pop();

        TreeNode c = t;

        if (c.right != null) {
            c = c.right;
            stack.push(c);

            while (c.left != null) {
                c = c.left;
                stack.push(c);
            }

        }

        return t.val;


    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */


