import java.util.Scanner;

public class ReadingBooleans {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a boolean");
    boolean bool = Boolean.valueOf(scanner.nextLine());
    System.out.println("You wrote " + bool);

    scanner.close();
  }
}

/* In case of bools, any words other than true (including all of its capital and small combinations), we get false */
