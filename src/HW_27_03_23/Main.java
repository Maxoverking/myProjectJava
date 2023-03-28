package HW_27_03_23;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    Создайте класс Person, которому при создании
//    передавайте имя и дату рождения в виде
//    строки в формате "ДД.ММ.ГГГГ".
//    Реализуйте в классе интерфейс Comparable<Person>,
//    в котором "меньше" будет значить "младше".
//    Подсказка: не обязательно вычислять возраст,
//    этому мы так и не научились. Но можно
//    сравнивать даты рождения!
//    Альтернативная подсказка: если очень хочется
//    вычислять возраст, то можно это делать
//    в миллисекундах с использованием getTime()!
    public static void main(String[] args) throws ParseException {
        List<Person> personLists = new ArrayList<>();
        personLists.add(new Person("Tom", "15.02.2020"));
        personLists.add(new Person("Bob", "12.03.2015"));
        personLists.add(new Person("Gut", "01.03.2010"));
        personLists.add(new Person("Pit", "26.03.2013"));
        personLists.add(new Person("Artem", "15.02.2020"));

        personLists.sort( new sortByAgeOrName());
        for (Person personList: personLists) {
            System.out.println("personList = " + personList);
        }
        Person youngest = personLists.get(0);
        Person oldest = personLists.get(0);
        for (Person person : personLists) {
            if (person.compareTo(youngest) > 0) {
                youngest = person;
            }
            if (person.compareTo(oldest) < 0) {
                oldest = person;
            }

        }
        System.out.printf("Самый младший человек: %s, дата рождения: %s, возраст: %d года%n", youngest.getName(), youngest.getBirthday(), youngest.getAge());
        System.out.printf("Самый старший человек: %s, дата рождения: %s, возраст: %d года%n", oldest.getName(), oldest.getBirthday(), oldest.getAge());

    }

}