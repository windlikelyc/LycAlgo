package testParalle.cha02.synchronizedUpdateNewValue;

public class Service {
  private boolean isContinuneRun = true;
  public void runMethod(){
    String anyThing = new String();
    while (isContinuneRun == true) {
      synchronized (anyThing) {

      }

    }
    System.out.println("停下来了");
  }

  public void stopMehtod(){
    isContinuneRun = false;
  }
}
