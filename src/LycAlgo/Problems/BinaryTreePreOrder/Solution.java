package LycAlgo.Problems.BinaryTreePreOrder;

import LycAlgo.utils.ListModule.ListNode;
import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;

import java.util.*;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        if(root == null){
            return list;
        }else {
            stack.push(root);
        }
        TreeNode t = root;

        while (!stack.isEmpty()) {

            if (t != null) {
                list.add(t.val);
                stack.push(t);
                t = t.left;
            }else {
                t = stack.pop();
                t = t.right;
            }
        }
        return list;
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        dfs(result, root, 0);
        return result;
    }

    private void dfs(List<Integer> result, TreeNode root, int h) {

        h += 1;
        if (h > result.size()) {
            result.add(root.val);
        }
        if (root.right != null) {
            dfs(result,root.right,h);
        }

        if (root.left != null) {
            dfs(result, root.left, h);
        }

        h -= 1;
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        List l = solution.rightSideView(TreeBuilder.getDefaultFullTree());
        System.out.println(l);


    }
}
