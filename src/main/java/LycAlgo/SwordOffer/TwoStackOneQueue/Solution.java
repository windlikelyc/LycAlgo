package LycAlgo.SwordOffer.TwoStackOneQueue;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>(); // 主战，存最新的数据
    Stack<Integer> stack2 = new Stack<Integer>(); // 从战，谈最老的数据

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
        ;
        System.out.println(solution.pop());
        ;
        solution.push(4);
        System.out.println(solution.pop());
        ;
        solution.push(5);
        System.out.println(solution.pop());
        ;
        System.out.println(solution.pop());
        ;

    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int i = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return i;
    }
}
