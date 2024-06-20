import java.util.Scanner;

public class ComparingStrings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String input = scanner.nextLine();

    if (input.equals("a balloon")) {
      System.out.println("The keyword matched");
    } else {
      System.out.println("Keyword not matched, try again");
    }

    scanner.close();
  }
}
