import java.util.Scanner;

public class StructureOfLoops {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;
    int validNumbers = 0;
    int invalidNumbers = 0;

    while (true) {
      int input = Integer.valueOf(reader.nextLine());

      if (input == 0) {
        break;
      }

      if (input < 0) {
        invalidNumbers++;
        continue;
      }

      sum += input;
      validNumbers++;
    }

    System.out.println("Sum of valid numbers: " + sum);
    System.out.println("Valid numbers: " + validNumbers);
    System.out.println("Invalid numbers: " + invalidNumbers);

    reader.close();
  }
}
