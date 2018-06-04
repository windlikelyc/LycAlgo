package algorithm.utils.Tree;

/**
 * Created by lyc on 2017/11/20.
 */

/**
 * *       10
         /  \
        5   -3
      / \    \
     3   2   11
    / \   \
   3  -2   1
 */
public class StandardTree {

    public TreeNode getTree(){

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);

        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);


        return root;


    }


}
