public class Person {

  // Varibales defined inside the class are called instance variables, or object fields, or object attributes. Each variable is preceded by the keyword private. The keyword private means that the variables are "hidden" inside the object. This is known as encapsulation.
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

  // Method parameter (Here the setter is implemented so the set keyword is used before both height and weight)
  // The keywords like set (for setter methods) and get (for getter methods) are a naming convention in java that are only used if the methods are solely setting or getting the value of that variable
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

  /*
  We are re defining this method with someother technique whic is more acceptable and standard
  
  public void printPerson() {
    System.out.println(this.name + ", age " + this.age + " years.");
  }
  */
  // This is the alternate and more precise way of achieving the above functionality
  // Moreover,here we are calling another method of the same class (the BMI method defined above)
  public String toString() {
    return this.name + ", age " + this.age + " years, my BMI is " + this.bodyMassIndex();
  }

  // Adding a method to change the instance variable value
  public void growOlder() {
    this.age += 1;
  }

  // We can also write methods in the classes that returns a boolean value
  public boolean isOfLegalAge() {
    if (this.age < 18) {
      return false;
    }
    return true;
  }

  // Defining a getter (these methods has a special convention in Java that they start with getVariableName)
  public String getName() {
    return this.name;
  }
}
