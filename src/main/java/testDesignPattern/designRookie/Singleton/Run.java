package testDesignPattern.designRookie.Singleton;

public class Run {

  public static void main(String[] args) {
    SingletonObject object = SingletonObject.getInstance();

    object.showMessage();
  }
}
