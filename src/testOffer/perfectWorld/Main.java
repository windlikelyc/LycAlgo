package testOffer.perfectWorld;

import java.util.Scanner;
import java.util.Stack;

// 设计一个带有最小值的栈，可以（o1）快速获取栈的最小值
public class Main{

  private  Stack<Integer> stackData = new Stack<>();
  private Stack<Integer> stackMin = new Stack<>();
  private Stack<Integer> stackMax = new Stack<>();

  public void push(int ele) {
    stackData.push(ele);
    if (stackMin.isEmpty() || stackMin.peek() >= ele) { // 如果站空或者 栈的当前最小值不小于当前元素
      stackMin.push(ele);
    }
    if (stackMax.isEmpty() || stackMax.peek() <= ele) { // 如果站空或者 栈的当前最小值不小于当前元素
      stackMax.push(ele);
    }
  }

  public int pop() {
    int popEle = stackData.pop();
    if (stackMin.peek() == popEle) {   // 相等才pop
      stackMin.pop();
    }
    if (stackMax.peek() == popEle) {   // 相等才pop
      stackMax.pop();
    }
    return popEle;
  }

  public int min() {
    return stackMin.peek();
  }
  public int max() {
    return stackMax.peek();
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Main main = new Main();
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      main.push(scanner.nextInt());
    }
    main.pop();
    System.out.print(main.max()+","+main.min());
  }
}
