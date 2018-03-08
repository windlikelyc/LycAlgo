package LycAlgo.Problems.TreeInorderTraversal;

import LycAlgo.utils.Tree.Tree;
import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {


    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode t = root;
        if(t == null) return new ArrayList<>();
        List<Integer> asn = new ArrayList<>();
        while (t!=null || !stack.isEmpty()) {
            while (t != null) {
                stack.push(t);
                t = t.left;
            }

            if (!stack.isEmpty()) { // important
                t = stack.pop();
                asn.add(t.val);
                t = t.right;
            }
        }
        return asn;
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        TreeBuilder treeBuilder = new TreeBuilder();
        TreeNode t = treeBuilder.getDefaultFullTree();
        System.out.println(solution.inorderTraversal(t));;

    }
}
