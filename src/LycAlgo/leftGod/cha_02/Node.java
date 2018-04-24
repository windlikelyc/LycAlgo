package LycAlgo.leftGod.cha_02;

public class Node {
  public int value;
  public Node next;

  public Node(int data) {
    this.value = data;
  }


  @Override
  public String toString() {
    Node t = this;
    String res = "";
    while (t != null&&t.next != null) {
      res += t.value;
      res += "-";
      t = t.next;
    }
    res += t.value;
    return res;
  }

  public void show(){
    Node t = this;
    String res = "";
    while (t != null&&t.next != null) {
      res += t.value;
      res += "-";
      t = t.next;
    }
    res += t.value;
    System.out.println(res);
  }
}
