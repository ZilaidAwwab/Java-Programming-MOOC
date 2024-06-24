import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int total = 0;
        int sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                total = total + 1;
                sum = sum + number;
            }
        }
        average = (double) sum / total;
        if (total == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
        scanner.close();
    }
}
