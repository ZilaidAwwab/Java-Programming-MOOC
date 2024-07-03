package ObjectAsObjectVariable;

public class Main {
  public static void main(String[] args) {
    SimpleDate date = new SimpleDate(1, 1, 2000);
    Person muhammad = new Person("Muhammad", date);
    Person pascal = new Person("Pascal", 16, 5, 1990);

    System.out.println(muhammad);
    System.out.println(pascal);
  }
}
