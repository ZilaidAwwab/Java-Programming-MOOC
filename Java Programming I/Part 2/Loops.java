import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numbersRead = 0;
    int sum = 0;

    while (true) {
      if (numbersRead == 5) {
        break;
      }
      System.out.println("Input number:");
      sum = sum + Integer.valueOf(scan.nextLine());
      numbersRead = numbersRead + 1;
    }
    System.out.println("The sum of the numbers is: " + sum);
    scan.close();
  }
}
