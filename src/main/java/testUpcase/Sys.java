package testUpcase;


class Animal{
  public void  eat(){
    System.out.println("父类的 eating");
  }
}
class Bird extends Animal{
  @Override
  public void eat() {
    System.out.println("子类重写父类的eating");
  }

  public void fly(){
    System.out.println("子类新方法 flying");
  }
}

public class Sys {

  public static void main(String[] args) {
    Animal b = new Bird();
    b.eat();

    sleep(new Male());
    sleep(new Female());

  }

  public static void sleep(Human human) {
    human.sleep();
  }

}
