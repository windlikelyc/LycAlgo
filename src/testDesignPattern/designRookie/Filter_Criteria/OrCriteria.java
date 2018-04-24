package testDesignPattern.designRookie.Filter_Criteria;


import java.util.List;

public class OrCriteria implements Criteria {

  private Criteria criteria;

  private Criteria othercriteria;

  public OrCriteria(Criteria criteria, Criteria othercriteria) {
    this.criteria = criteria;
    this.othercriteria = othercriteria;
  }

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> fisrtCirteriaPersons = criteria.meetCriteria(persons);
    List<Person> otherCriteriaPersons = othercriteria.meetCriteria(persons);

    for (Person person : otherCriteriaPersons) {
      if (!fisrtCirteriaPersons.contains(person)) {
        fisrtCirteriaPersons.add(person);
      }
    }
    return fisrtCirteriaPersons;
  }
}
