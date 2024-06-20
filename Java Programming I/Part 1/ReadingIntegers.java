import java.util.Scanner;

public class ReadingIntegers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number: ");
    
    // Converting string to integer
    int value = Integer.valueOf(scanner.nextLine());
    System.out.println("You wrote " + value);

    scanner.close();


    // Converting string to double
    String valueAsString = "32.34";
    double val = Double.valueOf(valueAsString);
    System.out.println(val); // 32.34


    // Converting integer to double
    int number = 32;
    double numToDouble = Double.valueOf(number);
    System.out.println(numToDouble); // 32.0
  }
}
