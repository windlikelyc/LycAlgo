package LycAlgo.leftGod.cha_03;

public class gernerTree {

  public Node generateTree(int[] sortArr) {
    if (sortArr == null) {
      return null;
    }
    return generate(sortArr, 0, sortArr.length - 1);
  }

  private Node generate(int[] sortArr, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node head = new Node(sortArr[mid]);
    head.left = generate(sortArr, start , mid-1);
    head.right = generate(sortArr, mid + 1, end);
    return head;

  }

}
