package LycAlgo.Problems.decodeString;

import java.util.Stack;

/**
 * Created by lyc on 2017/10/10.
 */
public class Solution {
    public String decodeString(String s) {
        String ans = "";
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {

            if (!(s.charAt(i) == ']')) {
                stack.push(s.charAt(i));
            } else {

                String tmp = "";
                String othertmp = "";
                while (stack.peek() != '[') {
                    tmp = stack.pop() + tmp;
                }
                //去掉左括号
                stack.pop();
//                int rate = Integer.parseInt(stack.pop()+"");
                String ratetmp = "";
                while (!stack.isEmpty() && (stack.peek() <= '9' && stack.peek() >= '0')) {
                    ratetmp = stack.pop() + ratetmp;
                }
                int rate = Integer.parseInt(ratetmp);

                while (rate != 0) {
                    othertmp = othertmp + tmp;
                    rate--;
                }

                for (int k = 0; k < othertmp.length(); k++) {
                    stack.push(othertmp.charAt(k));
                }
            }
        }

        System.out.print(stack);
        String ths = "";
        while (!stack.isEmpty()) {
            ths = stack.pop() + ths;
        }
        System.out.print(ths);


        return ths;

    }

//    @Test
//    public void test() {
//        decodeString("10[lyc]");
//    }
}
