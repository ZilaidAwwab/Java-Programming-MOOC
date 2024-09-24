import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        while(true) {
            int userInput = scanner.nextInt();
            if (userInput < 0) break;
            input.add(userInput);
        }
        input.stream().filter(e -> e >= 1 && e <= 5).forEach(e -> System.out.println(e));
        scanner.close();
    }
}
