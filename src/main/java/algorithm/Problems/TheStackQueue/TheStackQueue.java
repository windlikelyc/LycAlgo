package algorithm.Problems.TheStackQueue;


import java.util.Stack;

/**
 * Created by lyc on 2017/10/12.
 */
public class TheStackQueue {

    Stack<Integer> stack_mayor = new Stack<>();
    Stack<Integer> stack_tmp = new Stack<>();

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack_mayor.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {

        int thepop;
        while (!stack_mayor.isEmpty()) {
            stack_tmp.push(stack_mayor.pop());
        }
        thepop = stack_tmp.pop();
        while (!stack_tmp.isEmpty()) {
            stack_mayor.push(stack_tmp.pop());
        }
        return thepop;


    }

    /**
     * Get the front element.
     */
    public int peek() {
        int thepeek;
        while (!stack_mayor.isEmpty()) {
            stack_tmp.push(stack_mayor.pop());
        }
        thepeek = stack_tmp.peek();
        while (!stack_tmp.isEmpty()) {
            stack_mayor.push(stack_tmp.pop());
        }
        return thepeek;

    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {

        return stack_mayor.isEmpty();
    }

}
