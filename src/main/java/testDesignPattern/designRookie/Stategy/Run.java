package testDesignPattern.designRookie.Stategy;

public class Run {


  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());

    System.out.println(context.executeStragy(10, 5));

    context = new Context(new OperationSubstract());
    System.out.println(context.executeStragy(10, 5));


  }

}
