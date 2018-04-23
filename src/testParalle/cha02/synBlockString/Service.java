package testParalle.cha02.synBlockString;

public class Service {
  private String usernameParam;
  private String passwordParam;

  public void setUsernameParamPassword(String usernameParamm, String passwordParam) {
    try {
      String anyString = new String();
      synchronized (anyString) {
        System.out.println("线程名称为 ：" + Thread.currentThread().getName()
            + "z在" + System.currentTimeMillis() + "进入同步快");
        this.usernameParam = usernameParamm;
        Thread.sleep(3000);
        this.passwordParam = passwordParam;
        System.out.println("线程名称为 ：" + Thread.currentThread().getName()
            + "z在" + System.currentTimeMillis() + "离开同步快");


      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
