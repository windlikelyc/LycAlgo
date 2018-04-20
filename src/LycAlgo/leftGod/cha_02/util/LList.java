package LycAlgo.leftGod.cha_02.util;

import LycAlgo.leftGod.cha_02.Node;

public class LList {

  private Node head;

  private LList(){}

  public LList(int[] nums) {
    addAll(nums);
  }

  public Node getHead(){
    return head;
  }

  public Node addAll(int[] nums) {
    if (nums == null) {
      throw new RuntimeException("构造函数为空");
    }
    head = new Node(nums[0]);
    Node cur = head;
    for(int i =1;i < nums.length ;i++) {
      cur.next = new Node(nums[i]);
      cur = cur.next;
    }
    return head;
  }

  public  String toString() {
    Node cur = head;
    StringBuilder sb = new StringBuilder();
    while (cur != null) {
      sb.append(cur.value);
      sb.append(" ");
      cur = cur.next;
    }
    sb.deleteCharAt(sb.lastIndexOf(" "));
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new LList(new int[]{1,2,3}));
  }


}
