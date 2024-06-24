import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNums = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        System.out.print("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextInt());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum += num;
            inputNums++;
        }
        average = (double) sum / inputNums;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + inputNums);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}
