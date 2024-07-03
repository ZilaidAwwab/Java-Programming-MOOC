package MethodReturningObject;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter();
    counter.increase();
    counter.increase();

    System.out.println(counter); // 2

    Counter clone = counter.clone();

    System.out.println(counter); // 2
    System.out.println(clone); // 2

    counter.increase();
    counter.increase();
    counter.increase();
    counter.increase();

    System.out.println(counter); // 6
    System.out.println(clone); // 2

    clone.increase();

    System.out.println(counter); // 6
    System.out.println(clone); // 3
  }
}

// When we clone, the values of both objects are equal, but after that the changes occuring in either of them is not reflected in the other.
