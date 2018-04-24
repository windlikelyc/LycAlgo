package testDesignPattern.designRookie.Facade;

public class Run {


  public static void main(String[] args) {
    ShapeFacade shapeFacade = new ShapeFacade();
    shapeFacade.drawCircel();
    shapeFacade.drawSquare();

    shapeFacade.drawRectangle();
  }
}
