package LycAlgo.utils.Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 后续遍历：左右根
public class PostOrder {

    List<Integer> l = new ArrayList<>();

    public List<Integer> postorder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postOrder(root);
        return l;
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        l.add(root.val);
    }

    /**
     *    3
     * /   \
     * 1     5
     *     / \
     *     2   7
     * 1 ->  2  ->  7  -> 5  -> 3
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        TreeNode now = root;
        TreeNode pre = null;
        stack.add(now);
        while (!stack.isEmpty()) {

            if (now.left != null) {
                now = now.left;
                stack.add(now);
            } else if (now.right != null) {
                now = now.right;
                stack.add(now);
            } else {
                ans.add(stack.pop().val);
                if(stack.isEmpty()) break;

                    pre = stack.peek();
                    if (pre.left == now) {
                        pre.left = null;
                    } else if (pre.right == now) {
                        pre.right = null;
                    }

                now = stack.peek();
            }
        }
        return ans;
    }

    @Test
    public void test(){
        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(1);
        t.right = new TreeNode(5);
        t.right.left = new TreeNode(2);
        t.right.right = new TreeNode(7);
        System.out.print(postorderTraversal(t));

    }
}
