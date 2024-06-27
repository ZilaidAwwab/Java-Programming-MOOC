import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfOldest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput = input.split(",");
            int age = Integer.valueOf(splitInput[1]);
            if (age > ageOfOldest) {
                name = splitInput[0];
                ageOfOldest = age;
            }
        }

        System.out.println("Name of the oldest: " + name);

        scanner.close();
    }
}
