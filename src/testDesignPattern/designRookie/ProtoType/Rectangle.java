package testDesignPattern.designRookie.ProtoType;

public class Rectangle extends Shape {
  @Override
  void draw() {
    System.out.println("Inside Rectanle::draw() method");
  }

  public Rectangle(){
    type = "Rectangle";
  }
}
