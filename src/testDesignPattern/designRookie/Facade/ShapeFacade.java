package testDesignPattern.designRookie.Facade;

public class ShapeFacade {
  private Shape circle;
  private Shape rectangel;
  private Shape square;

  public ShapeFacade(){
    circle = new Circle();
    rectangel = new Rectangle();
    square = new Square();
  }

  public void drawCircel(){
    circle.draw();
  }

  public void drawRectangle(){
    rectangel.draw();

  }

  public void drawSquare(){
    square.draw();

  }
}
