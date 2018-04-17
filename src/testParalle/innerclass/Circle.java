package testParalle.innerclass;

// 成员内部类
public class Circle {
    private double radius = 0;
    public static int count = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    class Draw{
        public void drawShape(){ // 随便访问所有成员属性和方法
            System.out.println(radius); // 随便访问private
            System.out.println(count);  // 随便访问static

        }
    }


    private Draw getDrawInstance(){
        return new Draw(); //
    }


}
