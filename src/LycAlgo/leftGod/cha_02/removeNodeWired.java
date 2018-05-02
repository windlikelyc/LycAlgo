package LycAlgo.leftGod.cha_02;

public class removeNodeWired {

  public void removeNodeWired(Node node) {
    if (node == null) {
      return;
    }
    Node next = node.next;
    if (next == null) {
      throw new RuntimeException("can not remove last node");
    }
    node.value = next.value;
    node.next = next.next;
  }

}
