package testDesignPattern.designRookie.Singleton;

import testDesignPattern.designRookie.Builder.ColdDrink;

public class Pepsi extends ColdDrink {
  @Override
  public String name() {
    return "Coke";
  }

  @Override
  public float price() {
    return 35.0f;
  }
}
