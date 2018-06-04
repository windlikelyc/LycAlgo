package testDesignPattern.designRookie.Decorator;

public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape decoreatedShape) {
    super(decoreatedShape);
  }

  @Override
  public void draw() {
    decoreatedShape.draw();
    setRedBorder(decoreatedShape);
  }

  public void setRedBorder(Shape redBorder) {
    System.out.println("Border Color : Red");
  }
}
