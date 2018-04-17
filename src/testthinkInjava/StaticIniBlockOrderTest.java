package testthinkInjava;

class Parent{
    static String name = "hello";
    {
        System.out.println("parent blcok");
    }
    static {
        System.out.println("parent static block");
    }
    public Parent(){
        System.out.println("parent constructor");
    }
}

class Child extends Parent{
    static String childeName = "heii";
    {
        System.out.println("childe block");
    }
    static {
        System.out.println("child static block");
    }
    public Child(){
        System.out.println("child consturcotor ");
    }
}

public class StaticIniBlockOrderTest {
    public static void main(String[] args) {
        new Child();
    }



}
