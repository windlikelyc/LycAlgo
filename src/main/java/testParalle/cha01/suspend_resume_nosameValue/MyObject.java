package testParalle.cha01.suspend_resume_nosameValue;

public class MyObject {

  private String username = "1";
  private String password = "11";

  public void setValue(String u, String password) {
    this.username = u;
    if (Thread.currentThread().getName().equals("a")) {
      System.out.println("停止a线程！");
      Thread.currentThread().suspend();
    }
    this.password = password;
  }

  public void printusernamePassword(){
    System.out.println(username + " " + password);
  }
}
