package HW_27_03_23;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Person implements Comparable<Person>{
  private final String name;

  private final LocalDate birthday;
  private final int age;

  public Person(String name, String birthday)  {
    this.name = name;
    this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd.MM.yyyy")); ;
    this.age = getAge (birthday) ;
  }


  public String getName() {
    return name;
  }
  public LocalDate getBirthday() {
    return birthday;
  }
  public int getAge() {
    return age;
  }

  @Override
  public int compareTo(Person other) {
    return this.birthday.compareTo(other.birthday);
  }

  @Override
  public String toString() {
    return "{" +
            "name='" + name + '\'' +
            ", birthday='" + birthday + '\'' +
            ", age='" + age + '\'' +
            '}';
  }

  public int getAge (String birthday)   {
    LocalDate localDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    LocalDateTime localDateTime = localDate.atStartOfDay();
    long birthdayTimeInSeconds = localDateTime.toEpochSecond(ZoneOffset.UTC);

    long dateNow = currentTimeInASeconds();

    return convertToAge (birthdayTimeInSeconds, dateNow );


  }
  public static long currentTimeInASeconds(){
    Instant now = Instant.now();
    return now.getEpochSecond();
  }
  public static int convertToAge (long birthdayTimeInSeconds, long dateNow){
    long diffTime = dateNow - birthdayTimeInSeconds;
    long minutes = diffTime / 60;
    long hours = minutes / 60;
    long days = hours / 24;
    long years = days / 365;
    return  (int) years;
  }


}