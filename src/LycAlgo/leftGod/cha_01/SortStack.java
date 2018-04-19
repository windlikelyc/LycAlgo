package LycAlgo.leftGod.cha_01;

import java.util.Random;
import java.util.Stack;

// 只用一个栈实现将栈元素从大到小排序
public class SortStack {

    public static void sortStackbyStack(Stack<Integer> stack) {

        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()) {
            int i = stack.pop();
            while (!help.isEmpty() && i > help.peek()) {
                stack.push(help.pop());
            }
            help.push(i);
        }

        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0 ; i < 10000 ; i++) {
            s.push(new Random().nextInt(10000));
        }

        sortStackbyStack(s);
        System.out.println(s);
    }



}
