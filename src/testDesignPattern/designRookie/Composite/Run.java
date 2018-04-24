package testDesignPattern.designRookie.Composite;

public class Run {

  public static void main(String[] args) {
    Employee CEO = new Employee("lyc", "CEO", 30000);

    Employee headSales = new Employee("Robert", "head sales", 20000);

    Employee headMarketing = new Employee("Michel", "head marketing", 20000);

    Employee clerk1 = new Employee("Laura", "Marketing", 10000);
    Employee clerk2 = new Employee("Bob", "Marketing", 10000);

    Employee salesExe1 = new Employee("Richard", "sales", 10000);
    Employee salesExe2 = new Employee("Rob", "sales", 10000);

    CEO.add(headSales);
    CEO.add(headMarketing);

    headSales.add(salesExe1);
    headSales.add(salesExe2);

    headMarketing.add(clerk1);
    headMarketing.add(clerk2);

    System.out.println(CEO);

    for (Employee headEmployee : CEO.getSubordinates()) {
      System.out.println(headEmployee);
      for (Employee employee : headEmployee.getSubordinates()) {
        System.out.println(employee);

      }
    }
  }
}
