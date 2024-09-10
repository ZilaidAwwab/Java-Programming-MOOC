import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int totalNums = 0;
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {

                if (sum > 0) {
                    System.out.println(average(sum, totalNums));
                } else {
                    System.out.println("Cannot calculate the average");
                }
                break;
                
            } else if (input > 0) {
                sum += input;
                totalNums++;
            }
        }
        scanner.close();
    }
    
    public static double average(int sum, int totalNums) {
        double average = (double) sum / totalNums;
        System.out.println(average);
        return average;

    }
}
