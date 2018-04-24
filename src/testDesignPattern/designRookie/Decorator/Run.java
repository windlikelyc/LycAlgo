package testDesignPattern.designRookie.Decorator;

public class Run {
  public static void main(String[] args) {

    Shape circle = new Circle();

    Shape redCircle = new RedShapeDecorator(new Circle());

    Shape redRectangle = new RedShapeDecorator(new Rectangle());

    System.out.println("circle with normal border");
    circle.draw();

    System.out.println("\nCircle of red border");
    redCircle.draw();

    System.out.println("\nRedtangle of red border");
    redRectangle.draw();

  }
}
