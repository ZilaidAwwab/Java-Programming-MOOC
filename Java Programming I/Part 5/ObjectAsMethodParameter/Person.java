// Here we are trying to achieve the functionality of passing an object made from the same class, into the method of that class

package ObjectAsMethodParameter;

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

  // We implemented this functionality here, but adhering to the OOP rules, we can implement the same functionality inside the SimpleDate class with less verbose and complex code, so we will implement that there.

  /*
  // This is the functionality that we are trying implementing (and what we defined at the start)
  public boolean olderThan(Person person) {
    // 1. Comparing years first
    int ownYear = this.getBirthday().getYear();
    int comparedYear = person.getBirthday().getYear();

    if(ownYear < comparedYear) { // 780 < 800 (Here own is older)
      return true;
    }

    if (ownYear > comparedYear) {
      return false;
    }

    // 2. Same birthyears, so comparing months
    int ownMonth = this.getBirthday().getMonth();
    int comparedMonth = person.getBirthday().getMonth();

    if (ownMonth < comparedMonth) {
      return true;
    }

    if (ownMonth > comparedMonth) {
      return false;
    }
    
    // 3. Same birthyear and month, comparing days
    int ownDay = this.getBirthday().getDay();
    int comparedDay = person.getBirthday().getDay();
    
    if (ownDay < comparedDay) {
      return true;
    }
    
    return false;
  }
  */

  // After we have implemented the above functionality in the SimpleDate class now the work remaining for this class is under
  public boolean olderThan(Person person) {
    if (this.birthday.before(person.getBirthday())) {
        return true;
    }
    return false;
  }
}
