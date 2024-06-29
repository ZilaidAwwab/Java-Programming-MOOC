import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddingFileContentToAnArray {
  public static void main(String[] args) {
    ArrayList<String> lines = new ArrayList<>();

    try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lines.add(line);
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    System.out.println("Total lines: " + lines.size());
  }
}
