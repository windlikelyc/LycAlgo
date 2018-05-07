package LycAlgo.leftGod.cha_03;

public class Node {
  public int value;
  public Node left;
  public Node right;

  public Node(int data) {
    this.value = data;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
