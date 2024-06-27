import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputVal = scanner.nextLine();
            if (inputVal.equals("")) {
                break;
            } else {
                String[] splVal = inputVal.split(" ");
                System.out.println(splVal[0]);
            }
        }
        scanner.close();
    }
}
