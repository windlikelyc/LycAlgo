package testDesignPattern.designRookie.Visitor;

public class Keyboard implements ComputerPart {
  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);

  }
}
