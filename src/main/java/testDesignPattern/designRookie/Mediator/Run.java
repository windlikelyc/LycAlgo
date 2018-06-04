package testDesignPattern.designRookie.Mediator;

public class Run {

  public static void main(String[] args) {
    User robot = new User("Robert");
    User join = new User("join");

    robot.sendMessage("Hi Jon");
    join.sendMessage("Hello Robert");

  }
}
