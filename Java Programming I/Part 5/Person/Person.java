public class Person {
  private String name;
  private int age;
  private int height;
  private int weight;

  // First constructor
  /*
  public Person(String initialName) {
    this.name = initialName;
    this.age = 0;
    this.height = 0;
    this.weight = 0;
  }
  */

  // Here we are calling the constructor from within a constructor with an initial value of 0 for a param. The calling method will remain as it was before
  public Person(String initialName) {
    this (initialName, 0);
  }


  // Second constructor (Now with this we can create the Person object in 2 ways, one with the name param only and the other with the name and age param)
  public Person(String initialName, int initialAge) {
    this.name = initialName;
    this.age = initialAge;
    this.height = 0;
    this.weight = 0;
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
    return this.name + ", age " + this.age + " years, my BMI is " + this.bodyMassIndex();
  }

  // Method overloading
  public void growOlder() {
    this.age += 1;
  }

  public void growOlder(int years) {
    this.age = this.age + years;
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
}
