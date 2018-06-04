package LycAlgo.leftGod.cha_01;

import java.util.Stack;

public class TwoStackQueue {

  private Stack<Integer> stackPush;
  private Stack<Integer> stackPop;

  public TwoStackQueue() {
    stackPop = new Stack<>();
    stackPush = new Stack<>();
  }

  public void add(Integer i) {
    stackPush.push(i);
  }

  public Integer poll() {
    if (stackPush.isEmpty() && stackPop.isEmpty()) {
      throw new RuntimeException("hah ");
    }
    if (stackPop.isEmpty()) {
      while (!stackPush.isEmpty()) {
        stackPop.push(stackPush.pop());
      }
    }
    return stackPop.pop();
  }

  public Integer peek() {
    if (stackPush.isEmpty() && stackPop.isEmpty()) {
      throw new RuntimeException("hah ");
    }
    if (stackPop.isEmpty()) {
      while (!stackPush.isEmpty()) {
        stackPop.push(stackPush.pop());
      }
    }
    return stackPop.peek();
  }


}
