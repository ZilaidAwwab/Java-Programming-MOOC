// Implementing the equals method for checking whether the 2 objects are equal

package EqualityOfObjects;

public class SimpleDate {
  private int day;
  private int month;
  private int year;

  public SimpleDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return this.day;
  }

  public int getMonth() {
    return this.month;
  }

  public int getYear() {
    return this.year;
  }

  // Implementing the defined functionality
  public boolean equals(Object compared) {
    // 1. if the variables are located in the same position, they are equal
    if (this == compared) {
      return true;
    }

    // 2. if the type of compared objects are not equal, the objects are not equal
    if (!(compared instanceof SimpleDate)) {
      return false;
    }

    // 3. convert the object type compared object into SimpleDate type object called comparedSimpleDate
    SimpleDate comparedSimpleDate = (SimpleDate) compared;

    // 4. if the values of the object variables are the same, the objects are equal
    if (this.day == comparedSimpleDate.day &&
    this.month == comparedSimpleDate.month &&
    this.year == comparedSimpleDate.year) {
      return true;
    }

    // otherwise the objects are not equal
    return false;
  }

  @Override
  public String toString() {
    return this.day + "." + this.month + "." + this.year;
  }
}
