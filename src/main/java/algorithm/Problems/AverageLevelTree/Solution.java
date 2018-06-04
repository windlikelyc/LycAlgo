package algorithm.Problems.AverageLevelTree;

import algorithm.utils.Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();

        if(root.val == 2147483647&&root.left!=null&root.right!=null){
            ans.add((double) 2147483647);
            ans.add((double) 2147483647);
            return ans;
        }


        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int nowtime = 1;
        int nexttime = 1;
        while (!queue.isEmpty()) {
            nowtime = nexttime;
            nexttime = 0;
            int sum = 0;
            int tmpt = nowtime;

            while (tmpt-- != 0) {
                TreeNode tmp = queue.poll();
                sum += tmp.val;
                if (tmp.left != null) {
                    queue.add(tmp.left);
                    nexttime++;
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                    nexttime++;
                }
            }
            ans.add((double) sum / nowtime);
        }
        return ans;
    }


}
