import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.equals("")) break;
            input.add(userInput);
        }
        input.stream().forEach(e -> System.out.println(e));
        scanner.close();
    }
}
