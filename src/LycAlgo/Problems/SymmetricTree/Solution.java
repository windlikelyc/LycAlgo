package LycAlgo.Problems.SymmetricTree;

import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        List<TreeNode> tmplist = new ArrayList<>();
        findpath(list1,tmplist, p,root);
        tmplist.clear();
        findpath(list2,tmplist, q,root);
        System.out.println(list1);
        System.out.println(list2);

        int i = 0, j = 0;
        for (;  i<list1.size() && j < list2.size() ; i++,j++) {
            if (list1.get(i) != list2.get(j)) {
                return list1.get(i - 1);
            }
        }
        tmplist = list1.size() > list2.size() ? list2 : list1;
        return tmplist.get(i - 1);
    }

    private void findpath(List<TreeNode> list, List<TreeNode> tmp, TreeNode target, TreeNode root) {
        if (root == null) {
            return;
        }
        tmp.add(root);
        if (root == target) {
            list.addAll(tmp);
            return;
        }
        findpath(list,tmp,target,root.left);
        findpath(list,tmp,target,root.right);
        tmp.remove(tmp.size() - 1);
        return;
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        TreeNode root = TreeBuilder.getDefaultFullTree();
        TreeNode p = root.left.right; // 5
        TreeNode q = root.right.right; // 7

        solution.lowestCommonAncestor(root, p, q);

    }


}
