import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for? ");
        int searchedNumber = Integer.valueOf(scanner.nextLine());
        int indexofSearch = list.get(0);

        for (int i = 0; i <= list.size() - 1; i++) {
            int number = list.get(i);

            if (searchedNumber == number) {
                indexofSearch = i;
                System.out.println(searchedNumber + " is at index " + indexofSearch);
            }
        }
    }
}
