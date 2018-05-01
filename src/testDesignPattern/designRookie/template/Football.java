package testDesignPattern.designRookie.template;

public class Football extends Game {
  @Override
  void initialize() {
    System.out.println("football Game init");

  }

  @Override
  void startPlay() {
    System.out.println("football Game start");

  }

  @Override
  void endPlay() {
    System.out.println("football Game end");

  }
}
