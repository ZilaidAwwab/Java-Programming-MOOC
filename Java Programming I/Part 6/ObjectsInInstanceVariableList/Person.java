public class Person {

  private String name;
  private int age;
  private int height;
  private int weight;

  public Person(String initialName) {
    this.age = 0;
    this.height = 0;
    this.weight = 0;
    this.name = initialName;
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
