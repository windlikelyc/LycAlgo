package LycAlgo.Problems.findLargestValueInEachTreeRow;

import LycAlgo.utils.Tree.Tree;
import LycAlgo.utils.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lyc on 2017/9/5.
 */

//You need to find the largest value in each row of a binary tree.

/**
 * 使用了队列，果然积习难改
 * 很简单的递归求最值
 * <p>
 * AC了，还是蛮开心的
 * 使用了最擅长的sign pattern
 */
public class MySolution {

    List<Integer> l = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {

        if (root == null) return null;

        //想到用队列，每次循环取一层
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int nownum = 1;
        int nextnum = 0;
        while (!q.isEmpty()) {

            nextnum = 0;
            int max = Integer.MIN_VALUE;
            while (nownum != 0) {


                if (q.peek().left != null) {
                    q.add(q.peek().left);
                    nextnum++;
                }

                if (q.peek().right != null) {
                    q.add(q.peek().right);
                    nextnum++;
                }


                nownum--;
                max = Math.max(max, q.poll().val);

            }
            l.add(max);

            nownum = nextnum;
        }

        return l;
    }


}
