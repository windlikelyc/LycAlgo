package testUpcase;

public class Human {
  public void sleep(){
    System.out.println("父类人类 sleep...");
  }
}

class Male extends Human
{
  @Override
  public void sleep() {
    System.out.println("男人sleep ...");
  }
}
class Female extends Human{
  @Override
  public void sleep() {
    System.out.println("女人sleep ...");
  }
}
