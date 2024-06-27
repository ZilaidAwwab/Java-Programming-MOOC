import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        for (Integer nums: list) {
            sum += nums;
        }
        int totalItems = list.size();
        double average = (double) sum / totalItems;
        System.out.println("Average: " + average);
    }
}
