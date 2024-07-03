// We are also implementing the equals method for this class

package EqualityOfObjects;

public class Person {

  private String name;
  private SimpleDate birthday;
  private int age;
  private int height;
  private int weight;

  public Person(String initialName, SimpleDate date) {
    this.name = initialName;
    this.birthday = date;
    this.age = 0;
    this.height = 0;
    this.weight = 0;
  }

  public Person(String name, int day, int month, int year) {
    this.name = name;
    this.birthday = new SimpleDate(day, month, year);
  }

  // Same steps will be followed that were used in the SimpleDate object
  public boolean equals(Object compared) {
    // 1. if the variables are located in the same position, they are equal
    if (this == compared) {
      return true;
    }

    // 2. if the compared object is not of the type person, the objects are not equal
    if (!(compared instanceof Person)) {
      return false;
    }

    // 3. convert the object into a Person object
    Person comparedPerson = (Person) compared;

    // 4. if the values of the object variables are equal, the objects are equal
    if (this.name.equals(comparedPerson.name) &&
    this.age == comparedPerson.age && 
    this.weight == comparedPerson.weight &&
    this.height == comparedPerson.height) {
      return true;
    }

    // 5. otherwise the objects are not equal
    return false;
  }

  public void setHeight(int newHeight) {
    this.height = newHeight;
  }

  public void setWeight(int newWeight) {
    this.weight = newWeight;
  }

  public double bodyMassIndex() {
    double heightPerHundred = this.height / 100.0;
    return this.weight / (heightPerHundred * heightPerHundred);
  }

  public String toString() {
    return this.name + ", born on " + this.birthday;
  }

  public void growOlder() {
    this.age += 1;
  }

  public boolean isOfLegalAge() {
    if (this.age < 18) {
      return false;
    }
    return true;
  }

  public String getName() {
    return this.name;
  }

  public int getHeight() {
    return this.height;
  }

  public int ageAsYears() {
    return this.age;
  }

  public SimpleDate getBirthday() {
    return this.birthday;
  }

  // public boolean olderThan(Person person) {
  //   if (this.birthday.before(person.getBirthday())) {
  //       return true;
  //   }
  //   return false;
  // }
}
