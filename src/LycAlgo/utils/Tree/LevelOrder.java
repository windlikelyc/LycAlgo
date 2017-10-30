package LycAlgo.utils.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque();
        if (root == null) {
            return ans;
        }
        queue.add(root);
        TreeNode now = null;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int count = queue.size();
            while (count-- != 0) {
                now = queue.peek();
                if (now.left!= null) {
                    queue.add(now.left);
                }
                if (now.right != null) {
                    queue.add(now.right);
                }
                list.add(queue.poll().val);
            }
            ans.add(list);
        }
        return ans;
    }
}
