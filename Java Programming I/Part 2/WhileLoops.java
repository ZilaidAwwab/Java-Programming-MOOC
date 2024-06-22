import java.util.Scanner;

public class WhileLoops {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("Insert positive integers");
      int number = Integer.valueOf(scan.nextLine());
      if (number == 0) {
        break;
      }
      if (number < 0) {
        System.out.println("Unfit number. Try again!");
        continue;
      }
      System.out.println("Your input number was " + number);
    }
    scan.close();
  }
}
