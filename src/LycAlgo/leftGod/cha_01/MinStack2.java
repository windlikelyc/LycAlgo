package LycAlgo.leftGod.cha_01;

import java.util.Stack;

public class MinStack2 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack2() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(Integer ele) {
        stackData.push(ele);
        if (stackMin.isEmpty() || stackMin.peek() > ele) {
            stackMin.push(ele);
        }else {
            stackMin.push(stackMin.peek());
        }
    }

    public Integer pop() {
        if (stackData.isEmpty()) {
            return null;
        }
        stackMin.pop();
        return stackData.pop();
    }

    public Integer getMin() {
        return stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();

        minStack.push(2);
        minStack.push(1);
        minStack.push(3);
        System.out.println(minStack.getMin());


        minStack.pop();
        minStack.pop();
        System.out.println(minStack.getMin());
    }


}
