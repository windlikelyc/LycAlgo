package LycAlgo.Problems.SumRootToLeafNumbers;

import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayList;

public class Solution {

    private static Integer target = 0;

    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;

        preOrder(root, new ArrayList<Integer>());
        return target;
    }

    private void preOrder(TreeNode root, ArrayList<Integer> integers) {

        integers.add(root.val);

        if (root.left == null && root.right == null) {

            int cn = 1;
            int ta = 0;
            for (int i = integers.size() -1 ; i >= 0; i--) {
                ta += integers.get(i) * cn;
                cn *= 10;
            }
            integers.remove(integers.size() - 1);
            target += ta;
            return ;
        }


        if(root.left != null)  preOrder(root.left, integers );
        if(root.right != null)  preOrder(root.right, integers);
        integers.remove(integers.size() - 1);
        return ;
    }


    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        TreeBuilder t = new TreeBuilder(0);
        TreeNode root = t.left(1).get();
        System.out.println(root.toString2());

        int a = solution.sumNumbers(root);
        System.out.println(a);

    }
}
