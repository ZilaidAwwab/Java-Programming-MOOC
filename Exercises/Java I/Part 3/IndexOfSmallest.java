import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        int smallestNum = list.get(0);
        int indexOfSmallest = 0;

        for (int i = 0; i <= list.size() - 1; i++) {
            int number = list.get(i);
            if (number <= smallestNum) {
                smallestNum = number;
            }
        }
        System.out.println("Smallest number: " + smallestNum);

        for (int j = 0; j <= list.size() - 1; j++) {
            if (list.get(j) == smallestNum) {
                indexOfSmallest = j;
                System.out.println("Found at index: " + indexOfSmallest);
            }
        }
    }
}
