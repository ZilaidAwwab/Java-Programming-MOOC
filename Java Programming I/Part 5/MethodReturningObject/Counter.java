package MethodReturningObject;

public class Counter {
  private int value;

  public Counter() {
    this (0);
  }

  public Counter(int initialValue) {
    this.value = initialValue;
  }

  public void increase() {
    this.value += 1;
  }

  public String toString() {
    return "value: " + value;
  }

  public Counter clone() {
    Counter clone = new Counter(this.value);
    return clone; // returning clone to the caller
  }
}
