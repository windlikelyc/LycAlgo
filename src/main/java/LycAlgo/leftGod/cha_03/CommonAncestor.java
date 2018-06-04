package LycAlgo.leftGod.cha_03;

import java.util.HashMap;
import java.util.HashSet;

public class CommonAncestor {
  public Node lowestAncestor(Node head, Node o1, Node o2) {
    if (head == null || head == o1 || head == o2)
      return head;
    Node left = lowestAncestor(head.left, o1, o2);
    Node rigth = lowestAncestor(head.right, o1, o2);
    if (left != null && rigth != null) {
      return head;
    }
    return left != null ? left : rigth;
  }

  class Record1 {
    private HashMap<Node, Node> map;

    public Record1(Node head) {
      map = new HashMap<>();
      if (head != null) {
        map.put(head, null);
      }
      setMap(head);
    }

    private void setMap(Node head) {
      if (head == null) {
        return;
      }
      if (head.left != null) {
        map.put(head.left, head);
      }
      if (head.right != null) {
        map.put(head.right, head);
      }
      setMap(head.left);
      setMap(head.right);
    }

    public Node query(Node o1, Node o2) {
      HashSet<Node> path = new HashSet<>();
      while (map.containsKey(o1)) {
        path.add(o1);
        o1 = map.get(o1);
      }
      while (!path.contains(o2)) {
        o2 = map.get(o2);
      }
      return o2;
    }


  }

}
