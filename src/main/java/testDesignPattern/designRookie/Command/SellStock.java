package testDesignPattern.designRookie.Command;

public class SellStock implements Order {

  private Stock abcstock;

  public SellStock(Stock abcstock) {
    this.abcstock = abcstock;
  }

  @Override
  public void execute() {
    abcstock.sell();
  }
}
