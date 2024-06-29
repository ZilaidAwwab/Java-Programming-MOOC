import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
