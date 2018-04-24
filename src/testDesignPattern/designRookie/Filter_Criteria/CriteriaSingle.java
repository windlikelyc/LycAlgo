package testDesignPattern.designRookie.Filter_Criteria;
import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
  @Override
  public List<Person> meetCriteria(List<Person> persons) {

    List<Person> singlePersons = new ArrayList<>();
    for (Person person : persons) {
      if (person.getGender().equalsIgnoreCase("SINGLE")) {
        singlePersons.add(person);
      }
    }
    return singlePersons;
  }
}
