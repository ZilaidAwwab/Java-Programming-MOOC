import java.util.Scanner;

public class ReadingDataFromCSVFormatFile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Enter name and age separated by commas.");
      String line = scanner.nextLine();

      if (line.equals("")) {
        break;
      }

      String[] parts = line.split(",");
      String name = parts[0];
      int age = Integer.valueOf(parts[1]);

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }

    scanner.close();
  }
}
// Reading data from the file requires small modification
