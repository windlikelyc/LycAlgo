package LycAlgo.leftGod.cha_02;

import LycAlgo.leftGod.cha_02.util.LList;

import java.util.HashSet;

public class DeleteSame {
  // Hash,头节点肯定不会被删，放入Hash，接下来每次从Hash中取值
  // On , On
  public void removeRepl(Node head) {
    if (head == null) {
      return;
    }
    HashSet<Integer> set = new HashSet<>();
    Node pre = head;
    Node cur = head.next;
    set.add(head.value);
    while (cur != null) {
      if (set.contains(cur.value)) {
        pre.next = cur.next;
      } else {
        set.add(cur.value);
        pre = cur;
      }
      cur = cur.next;
    }
  }

  // 类似排序的过程,每次卡当前一个值，向后遍历，如果相等则删除。遍历n次
  // On,On
  public void removeRep2(Node head) {
    Node cur = head;
    Node pre = null;
    Node next = null;
    while (cur != null) {
      pre = cur;
      next = cur.next;
      while (next != null) {
        if (cur.value == next.value) {
          pre.next = next.next;
        }else {
          pre = next;
        }
        next = next.next;
      }
      cur = cur.next;
    }

  }

  public static void main(String[] args) {
    Node a = new LList(new int[]{1, 2, 3, 3, 4, 4, 2, 1, 1}).getHead();

    new DeleteSame().removeRep2(
        a
    );
    a.show();
  }
}
