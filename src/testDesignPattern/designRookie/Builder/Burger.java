package testDesignPattern.designRookie.Builder;

import testDesignPattern.designRookie.Singleton.Wrapper;

public abstract class Burger implements Item {

  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract float price();
}
