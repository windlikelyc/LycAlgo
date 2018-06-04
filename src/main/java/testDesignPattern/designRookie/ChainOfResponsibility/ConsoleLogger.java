package testDesignPattern.designRookie.ChainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Standrad Console::Logger: " + message);

  }
}
