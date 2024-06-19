import java.util.Scanner;

public class ReadingInput {
  public static void main(String[] args) {

    // create a tool for reading user input and name it scanner
    Scanner scanner = new Scanner(System.in);

    // Print, write a message
    System.out.println("Write a message: ");

    // Waits for the user to enter something then read the string written by the user, and assign it to program memory
    String message = scanner.nextLine();

    // Print the message written by the user
    System.out.println(message);

    // Close the scanner
    scanner.close();
  }
}
