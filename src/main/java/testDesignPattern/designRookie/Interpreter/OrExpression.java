package testDesignPattern.designRookie.Interpreter;

public class OrExpression implements Expression {

  public OrExpression(Expression expr1, Expression expr2) {
    this.expr1 = expr1;
    this.expr2 = expr2;
  }

  private Expression expr1 = null;
  private Expression expr2 = null;


  @Override
  public boolean interpret(String context) {
    return expr1.interpret(context) || expr2.interpret(context);
  }
}
