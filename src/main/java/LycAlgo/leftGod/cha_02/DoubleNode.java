package LycAlgo.leftGod.cha_02;

public class DoubleNode {

  public int value;
  public DoubleNode last;
  public DoubleNode next;

  public DoubleNode(int data) {
    this.value = data;
  }

//  @Override
//  public String toString() {
//    DoubleNode d = this;
//    String tmp = "";
//    while (d != null && d.next != null) {
//      tmp += d.value;
//      tmp += "<-->";
//      d = d.next;
//    }
//    tmp += d.value;
//    return tmp;
//  }
}
