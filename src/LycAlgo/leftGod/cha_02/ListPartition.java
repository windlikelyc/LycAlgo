package LycAlgo.leftGod.cha_02;

import LycAlgo.leftGod.cha_02.util.LList;

// 左边的比privot小,右边的比privot大,不要求顺序
// 进阶:要求顺序和之前的出现顺序一样
public class ListPartition {
  // 将节点放入数组,并快排
  public Node listPartition1(Node head, int pivot) {
    if (head == null) {
      return head;
    }
    Node cur = head;
    int i = 0;
    while (cur != null) {
      i++;
      cur = cur.next;
    }
    Node[] nodeArr = new Node[i];
    i = 0;
    cur = head;
    for (i = 0; i != nodeArr.length; i++) {
      nodeArr[i] = cur;
      cur = cur.next;
    }
    arrPartition(nodeArr, pivot);
    for (i = 1; i != nodeArr.length; i++) {
      nodeArr[i - 1].next = nodeArr[i];
    }
    nodeArr[i - 1].next = null;
    return nodeArr[0];
  }

  public Node listPartition2(Node head, int pivot) {

    Node smallHead = null;
    Node smallTail = null;
    Node equalHead = null;
    Node equalTail = null;
    Node bigHead = null;
    Node bigTail = null;
    Node next = null;
    while (head != null) {
      next = head.next;
      head.next = null;
      if (head.value < pivot) {
        if (smallHead == null) {
          smallHead = head;
          smallTail = head;
        } else {
          smallTail.next = head;
          smallTail = head;
        }
      } else if (head.value == pivot) {
        if (equalHead == null) {
          equalHead = head;
          equalTail = head;
        } else {
          equalTail.next = head;
          equalTail = head;
        }
      } else {
        if (bigHead == null) {
          bigHead = head;
          bigTail = head;
        } else {
          bigTail.next = head;
          bigTail = head;
        }
      }
      head = next;
    }
    if (smallTail != null) {
      smallTail.next = equalHead;
      equalTail = equalTail == null ? smallTail : equalTail;
    }

    if (equalTail != null) {
      equalTail.next = bigHead;
    }
    return smallHead != null ? smallHead : equalHead != null ? equalHead : bigHead;
  }


  private void arrPartition(Node[] nodeArr, int pivot) {
    int small = -1;
    int big = nodeArr.length;
    int index = 0;
    while (index != big) {
      if (nodeArr[index].value < pivot) {
        swap(nodeArr, ++small, index++);
      } else if (nodeArr[index].value == pivot) {
        index++;
      } else {
        swap(nodeArr, --big, index);
      }
    }

  }

  private void swap(Node[] nodeArr, int a, int b) {
    Node tmp = nodeArr[a];
    nodeArr[a] = nodeArr[b];
    nodeArr[b] = tmp;
  }

  public static void main(String[] args) {
    Node h = new LList(new int[]{1, 4, 6, 2, 3, 8}).getHead();
    new ListPartition().listPartition2(h, 5);
    h.show();
  }

}
