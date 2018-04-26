package testDesignPattern.designRookie.Visitor;

public interface ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor);
}
