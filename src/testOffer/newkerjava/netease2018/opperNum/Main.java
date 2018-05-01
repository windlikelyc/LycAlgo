package testOffer.newkerjava.netease2018.opperNum;

import testDesignPattern.designRookie.State.StartState;

import java.util.Scanner;
import java.util.Stack;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String str_n = n + "";
    Stack<Character> stack = new Stack();
    for (char c : str_n.toCharArray()) {
      stack.push(c);
    }
    StringBuilder sb = new StringBuilder();
    boolean isfirst = true;
    while (!stack.isEmpty()) {
      char p = stack.pop();
      if (p == '0' && isfirst) {
        continue;
      }else {
        isfirst = false;
        sb.append(p);
      }
    }
    System.out.println(Integer.parseInt(sb.toString())+n);
  }
}
