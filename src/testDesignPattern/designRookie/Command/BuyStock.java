package testDesignPattern.designRookie.Command;

public class BuyStock implements Order {

  private Stock abcstock;

  public BuyStock(Stock abcstock) {
    this.abcstock = abcstock;
  }

  @Override
  public void execute() {
    abcstock.buy();
  }
}
