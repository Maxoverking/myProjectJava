package HW_27_03_23;

import java.util.Comparator;

public class sortByAgeOrName implements Comparator<Person> {
  @Override
  public int compare(Person o1, Person o2) {
    int sortAge = o1.getAge() - o2.getAge();
    if (sortAge != 0) {
      return sortAge;
    }
    return o1.getName().compareToIgnoreCase(o2.getName());
  }
}
