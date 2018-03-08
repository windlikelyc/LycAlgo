package LycAlgo.Problems.BinaryTreeZigzagLevel;

import LycAlgo.utils.Tree.TreeBuilder;
import LycAlgo.utils.Tree.TreeNode;
import com.sleepycat.je.tree.IN;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode t = root;
        List<List<Integer>> lists = new ArrayList<>();
        if(root==null ) return new ArrayList<>();
        queue.add(t);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            final int l = queue.size();
            for(int i = 0 ; i <  l ;i++) {
                t = queue.poll();
                level.add(t.val);

                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }

            lists.add(level);
        }
        reverse(lists);
        return lists;
    }

    private void reverse(List<List<Integer>> lists) {
        for(int i = 0 ; i < lists.size() >>> 1 ;i ++) {
            List<Integer> tmp = lists.get(i);
            lists.set(i, lists.get(lists.size() - i - 1));
            lists.set(lists.size() - i - 1, tmp);
        }
        return;
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.zigzagLevelOrder(TreeBuilder.getDefaultFullTree()));


    }
}
