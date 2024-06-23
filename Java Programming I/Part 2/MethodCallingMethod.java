import java.util.Scanner;

public class MethodCallingMethod {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = Integer.valueOf(scanner.nextLine());
    multiplicationTable(number);
    scanner.close();
  }

  public static void multiplicationTable(int max) {
    int num = 1;

    while (num <= max) {
      printMultiplicationTable(num, max);
      num++;
    }
  }

  public static void printMultiplicationTable(int number, int max) {
    int printable = number;
    while (printable <= number * max) {
      System.out.print(" " + printable);
      printable += number;
    }
    System.out.println("");
  }
}
