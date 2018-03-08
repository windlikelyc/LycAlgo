package LycAlgo.Problems.UniqueBinaryTree;

import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayList;

public class Solution{

    public ArrayList<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    private ArrayList<TreeNode> generateTrees(int left, int right) {

        ArrayList<TreeNode> res = new ArrayList<TreeNode>();

        if(left >  right) {
            res.add(null);
            return res;
        }
        for(int i = left ; i <= right ; i++) {
            ArrayList<TreeNode> lefts = generateTrees(left, i - 1);
            ArrayList<TreeNode> rights = generateTrees(i + 1, right);
            for(int j = 0 ; j < lefts.size() ; j++) {
                for(int k = 0 ; k < rights.size();k++) {
                    TreeNode root = new TreeNode(i);
                    root.left = lefts.get(j);
                    root.right = rights.get(k);
                    res.add(root);
                }
            }

        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateTrees(3);
    }


}