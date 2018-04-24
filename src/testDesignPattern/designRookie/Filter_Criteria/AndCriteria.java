package testDesignPattern.designRookie.Filter_Criteria;

import java.util.List;

public class AndCriteria implements Criteria {

  private Criteria criteria;

  private Criteria othercriteria;

  public AndCriteria(Criteria criteria, Criteria othercriteria) {
    this.criteria = criteria;
    this.othercriteria = othercriteria;
  }

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> fisrtCirteriaPersons = criteria.meetCriteria(persons);
    return othercriteria.meetCriteria(fisrtCirteriaPersons);
  }
}
