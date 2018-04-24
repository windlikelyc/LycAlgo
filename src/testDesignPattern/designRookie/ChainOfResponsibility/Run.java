package testDesignPattern.designRookie.ChainOfResponsibility;

public class Run {
  private static AbstractLogger getChainOfLoggers(){
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consloeLogger  = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consloeLogger);

    return errorLogger;
  }

  public static void main(String[] args) {
    AbstractLogger loggerchain = getChainOfLoggers();

    loggerchain.logMessage(AbstractLogger.INFO, "i");
    loggerchain.logMessage(AbstractLogger.DEBUG, "d");
    loggerchain.logMessage(AbstractLogger.ERROR, "e");
  }
}
