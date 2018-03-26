package algorithm.Problems.maxWindow;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w) {
                qmax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    public Map findRightMax(int[] arr) {
        Stack<Integer> stack = new Stack();
        Map<Integer,Integer> lmap = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++) {
            int cur = arr[i];
            while (!stack.isEmpty() && stack.peek() < cur) {
                Integer pre = stack.pop();
                if(stack.isEmpty()){
                    lmap.put(pre, null);
                }else {
                    lmap.put(pre, stack.peek());
                }

            }
            stack.push(cur);
        }

        while (!stack.isEmpty()) {
            Integer pre = stack.pop();
            if(stack.isEmpty()){
                lmap.put(pre, null);
            }else {
                lmap.put(pre, stack.peek());
            }

        }
        return lmap;

    }


}
