package LycAlgo.leftGod.cha_02;


import LycAlgo.leftGod.cha_02.util.LList;
// 删除中间结点
// 进阶：给定链表head，删除a/b之间的节点
public class DeleteAdivideB {

  // 仅供娱乐
  public Node MydeleteAdivideB(int a, int b, Node head) {
    float divider = (float) a / (float) b;
    if (divider <= 0 || divider > 1) {
      return head;
    }
    Node tmp = head;
    int length = 0;
    while (tmp != null) {
      length++;
      tmp = tmp.next;
    }
    tmp = head;
    float i = 1;
    float index = i / length;
    while (tmp != null && i <= length) {
      if (divider <= index) {
        if (i == 1) {
          Node tmphead = head.next;
          head.next = null;
          return tmphead;
        }else {

          Node pre = head;
          for(int j = 1; j  <i-1;j++) {
            pre = pre.next;
          }
          Node tobedelete = tmp;
          pre.next = tobedelete.next;
          tobedelete.next = null;
          break;
        }
      }else {
        i++;
        index = i / length;
        tmp = tmp.next;
      }
    }
    return head;
  }

  public Node removeMideNode(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    if (head.next.next == null) {
      return head.next;
    }

    Node pre = head;
    Node cur = head.next.next;
    // 链表长度每增加2，要删除的节点就后移一个节点
    while (cur.next != null && cur.next.next != null) {
      pre = pre.next;
      cur = cur.next.next;
    }
    pre.next = pre.next.next;
    return head;
  }

  public Node removeByRatio(Node head, int a, int b) {
    if (a < 1 || a > b) {
      return head;
    }
    int n = 0;
    Node cur = head;
    while (cur != null) {
      n++;
      cur = cur.next;
    }
    // 待删除的节点是a倍长度除以b并向上取整
    n = (int) Math.ceil((double) (a * n) / (double) b);
    // 可以抽象出删除方法
    if (n == 1) {
      head = head.next;
    }
    if (n > 1) {
      cur = head;
      while (--n != 1) {
        cur = cur.next;
      }
      cur.next = cur.next.next;
    }
    return head;
  }

  public static void main(String[] args) {
    System.out.println(new DeleteAdivideB().
        removeByRatio(new LList(new int[]{
        1,2,3,4,5,6,7
    }).getHead(),7,8));
  }

}
