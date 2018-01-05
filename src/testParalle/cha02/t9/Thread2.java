package testParalle.cha02.t9;

public class Thread2 extends Thread{
  private MyOneList list;
  public Thread2(MyOneList list){
    super();
    this.list = list;
  }

  @Override
  public void run() {
    Service sRef = new Service();
    sRef.addServiceMethod(list, "B");

  }
}
