package testDesignPattern.designRookie.Visitor;

public class Monitor implements ComputerPart {
  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
