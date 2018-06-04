package LycAlgo.leftGod.cha_01;

import java.util.Stack;

// 设计一个带有最小值的栈，可以（o1）快速获取栈的最小值
public class MinStack {

    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int ele) {
        stackData.push(ele);
        if (stackMin.isEmpty() || stackMin.peek() >= ele) { // 如果站空或者 栈的当前最小值不小于当前元素
            stackMin.push(ele);
        }
    }

    public Integer pop() {
        if (stackData.isEmpty()) {
            return null;
        }
        int popEle = stackData.pop();
        if (stackMin.peek() == popEle) {   // 相等才pop
            stackMin.pop();
        }
        return popEle;
    }

    public Integer getMin() {
        if (stackMin.isEmpty()) {
            return null;
        }
        return stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(2);
        minStack.push(1);
        minStack.push(3);
        System.out.println(minStack.getMin());


        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
    }



}
