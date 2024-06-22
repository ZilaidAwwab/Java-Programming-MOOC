import java.util.Scanner;

public class CustomMethods {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Let's print the method we created.");

    // Calling the method
    greet();
    greet();
    greet();

    scanner.close();
  }

  public static void greet() {
    System.out.println("Hello, I am the new method.");
  }
}
