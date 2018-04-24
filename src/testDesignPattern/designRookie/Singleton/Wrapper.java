package testDesignPattern.designRookie.Singleton;

import testDesignPattern.designRookie.Builder.Packing;

public class Wrapper implements Packing {

  @Override
  public String pack() {
    return "Wrapper";
  }
}
