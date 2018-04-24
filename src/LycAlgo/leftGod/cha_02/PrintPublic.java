package LycAlgo.leftGod.cha_02;

import LycAlgo.leftGod.cha_02.util.LList;

// 打印两个有序链表的公共部分
public class PrintPublic {

  public void printCommonPart(Node head1, Node head2) {
    while (head1 != null && head2 != null) {
      if (head1.value < head2.value) {
        head1 = head1.next;
      } else if (head1.value > head2.value) {
        head2 = head2.next;
      } else {
        System.out.println(head1.value);
        head1 = head1.next;
        head2 = head2.next;
      }
    }
  }

  public static void main(String[] args) {
    new PrintPublic().printCommonPart(
        new LList(new int[]{1, 1, 3, 3, 4}).getHead(),
        new LList(new int[]{1, 2, 3, 4}).getHead());
  }


}
