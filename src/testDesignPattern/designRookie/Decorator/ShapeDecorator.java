package testDesignPattern.designRookie.Decorator;

public abstract class ShapeDecorator implements Shape{

  protected Shape decoreatedShape;

  public ShapeDecorator(Shape decoreatedShape) {
    this.decoreatedShape = decoreatedShape;
  }

  @Override
  public void draw() {
    decoreatedShape.draw();
  }
}
