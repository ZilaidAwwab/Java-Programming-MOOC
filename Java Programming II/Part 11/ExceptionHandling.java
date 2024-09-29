import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // We are given a situation where we have a string that we want to change
        // to integer, but that wont be possible if the string is not a number,
        // so this is an error and we want to handle that

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // if the input is not a number then we will face an error, which we have handled
        try {
            int number = Integer.parseInt(input);
        } catch(Exception e) {
            System.out.println("User input was not a number.");
        }
        scanner.close();
    }
}
