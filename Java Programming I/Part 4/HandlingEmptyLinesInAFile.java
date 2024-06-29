import java.nio.file.Paths;
import java.util.Scanner;

public class HandlingEmptyLinesInAFile {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);

    System.out.println("Enter the file name: ");
    String fileName = scanner.nextLine();

    try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();

        // Now here we are dealing with the exception of encountering an empty line in the program which we want to skip
        if (line.isEmpty()) {
          // We just continue so to scan the other lines remaining in the file
          continue;
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    scanner.close();
  }
}
