package LycAlgo.leftGod.cha_01;

import java.util.Random;
import java.util.Stack;

// 仅仅使用递归反转一个栈
public class ReverseStack {

  public static int getAndRemoveLastElement(Stack<Integer> stack) {
    int result = stack.pop();
    if (stack.isEmpty()) {
      return result;
    } else {
      int lastEle = getAndRemoveLastElement(stack);
      stack.push(result);
      return lastEle;
    }
  }

  public static void reverse(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return;
    }
    int i = getAndRemoveLastElement(stack);
    reverse(stack);
    stack.push(i);
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();


    for (int i = 0; i < 10; i++) {
      stack.push(new Random().nextInt(10));
    }
    System.out.println("之前的stack" + stack);

    reverse(stack);
    System.out.println("之后的stack" + stack);

    return;
  }

}
