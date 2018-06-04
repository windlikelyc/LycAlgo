package algorithm.Problems.TheQueueStack;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by lyc on 2017/10/12.
 */
public class TheQueueStack {
    boolean isq1 = true;
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    /**
     * Push element x onto stack.
     */
    public void push(int x) {

        if (isq1) {
            queue1.add(x);
        } else {
            queue2.add(x);
        }

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int thepop;
        if (isq1) {
            while (queue1.size() != 1) {
                queue2.add(queue1.poll());
            }
            thepop = queue1.poll();
            isq1 = !isq1;
        } else {
            while (queue2.size() != 1) {
                queue1.add(queue2.poll());
            }
            thepop = queue2.poll();
            isq1 = !isq1;
        }
        return thepop;

    }

    /**
     * Get the top element.
     */
    public int top() {
        int thetop = 0;
        if (isq1) {
            while (!queue1.isEmpty()) {
                if (queue1.size() == 1) {
                    thetop = queue1.peek();
                }
                queue2.add(queue1.poll());
            }
            isq1 = !isq1;
        } else {
            while (!queue2.isEmpty()) {
                if (queue2.size() == 1) {
                    thetop = queue2.peek();
                }
                queue1.add(queue2.poll());
            }
            isq1 = !isq1;
        }
        return thetop;

    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        if (isq1) {
            return queue1.isEmpty();
        } else {
            return queue2.isEmpty();
        }

    }

//    @Test
//    public void teset() {
//        push(1);
//
//        push(2);
//
//        push(3);
//        System.out.println(top());
//
//        pop();
//        pop();
//        System.out.println(top());
//
//
//    }
}
