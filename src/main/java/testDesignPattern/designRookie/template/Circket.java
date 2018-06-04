package testDesignPattern.designRookie.template;

public class Circket extends Game {

  @Override
  void initialize() {
    System.out.println("Ciret Game initailze");
  }

  @Override
  void startPlay() {
    System.out.println("Ciret Game start");

  }

  @Override
  void endPlay() {
    System.out.println("Ciret Game end");
  }
}
