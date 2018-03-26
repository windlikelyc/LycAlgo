package algorithm.Problems.addOneRowToTree;

import algorithm.utils.Tree.Tree;
import algorithm.utils.Tree.TreeNode;

public class Solution {

    private static final int LEFT = 1;
    private static final int RIGHT = 1;

    private int wanted_d;
    private int wanted_v;



    /**
     * 加入一行到二叉树中
     * @param root
     * @param v 插入的值
     * @param d 深度
     * @return
     */
    public TreeNode addOneRow(TreeNode root, int v, int d) {

        wanted_d = d;
        wanted_v = v;

        if(d == 1){
            TreeNode treeNode = new TreeNode(wanted_v);
            treeNode.left = root;
            return treeNode;
        }

        if (root.left != null) {
            go(root.left,  2, LEFT,root);
        }

        if (root.right != null) {
            go(root.right,  2, RIGHT,root);
        }

        return root;

    }

    /**
     *  插入一个节点到当前层
     * @param t 当前节点
     * @param depth 当前深度
     * @param ho 从哪边来的
     * @param fa 夫节点
     */
    private void go(TreeNode t, int depth, int ho,TreeNode fa) {

        if (depth == wanted_d) {
            // 插入
            TreeNode node = new TreeNode(wanted_v);
            if (ho == LEFT) {
                node.left = fa.left;
                fa.left = node;
            }

            if (ho == RIGHT) {
                node.right = fa.right;
                fa.right = node;
            }

            return;
        }
        if (t == null) {
            return;
        }
        go(t.left, depth + 1, LEFT, t);
        go(t.right, depth + 1, RIGHT, t);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(1);

        Solution solution = new Solution();
        solution.addOneRow(t1,3,2);
        Tree tree = new Tree(t1);
        tree.show();

    }
}
