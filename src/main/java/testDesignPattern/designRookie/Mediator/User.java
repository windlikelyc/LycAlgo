package testDesignPattern.designRookie.Mediator;

public class User {

  public void sendMessage(String message) {
    ChatRoom.showMessage(this, message);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User(String name) {

    this.name = name;
  }

  private String name;

}
