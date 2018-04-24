package testDesignPattern.designRookie.Filter_Criteria;


import java.util.List;

public interface Criteria {
  public List<Person> meetCriteria(List<Person> persons);
}
