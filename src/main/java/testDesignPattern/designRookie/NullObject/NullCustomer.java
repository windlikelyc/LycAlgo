package testDesignPattern.designRookie.NullObject;

public class NullCustomer extends AbstractCustomer{

  @Override
  public boolean isNil() {
    return true;
  }

  @Override
  public String getName() {
    return "Not Avaliable in Customer Database";
  }
}
