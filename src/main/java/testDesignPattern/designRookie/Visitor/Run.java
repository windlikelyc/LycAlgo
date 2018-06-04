package testDesignPattern.designRookie.Visitor;

public class Run {

  public static void main(String[] args) {
    ComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVistor());

  }
}
