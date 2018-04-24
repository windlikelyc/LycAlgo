package testDesignPattern.designRookie.Filter_Criteria;


import java.util.ArrayList;
import java.util.List;

public class Run {
  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person("lyc", "Male", "Single"));
    personList.add(new Person("lyc", "Male", "Single"));
    personList.add(new Person("lyc", "Male", "Single"));
    personList.add(new Person("lyc", "Male", "Single"));
    personList.add(new Person("lyc", "Male", "Single"));

    Criteria male = new CriteriaMale();
    Criteria female = new CriteriaFemal();
    Criteria singel = new CriteriaSingle();
    Criteria SandM = new AndCriteria(singel, male);
    Criteria SorF = new OrCriteria(singel, female);

    //以下略取筛选过程,太钢了
  }
}
