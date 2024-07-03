package ObjectAsObjectVariable;

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

  // Here the SimpleDate class can also get created this way, and both are fine
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
}
