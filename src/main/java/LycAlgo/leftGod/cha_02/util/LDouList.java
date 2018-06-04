package LycAlgo.leftGod.cha_02.util;

import LycAlgo.leftGod.cha_02.DoubleNode;

public class LDouList {
  private DoubleNode head;

  private LDouList() {
  }

  public LDouList(int[] nums) {
    addAll(nums);
  }

  public DoubleNode getHead() {
    return head;
  }

  public DoubleNode addAll(int[] nums) {
    if (nums == null) {
      throw new RuntimeException("构造函数为空");
    }
    head = new DoubleNode(nums[0]);
    DoubleNode cur = head;
    for (int i = 1; i < nums.length; i++) {
      DoubleNode nNode = new DoubleNode(nums[i]);
      cur.next = nNode;
      nNode.last = cur;
      cur = cur.next;
    }
    return head;
  }

  public String toString() {
    DoubleNode cur = head;
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
    System.out.println(new LDouList(new int[]{1, 2, 3}));
  }

}
