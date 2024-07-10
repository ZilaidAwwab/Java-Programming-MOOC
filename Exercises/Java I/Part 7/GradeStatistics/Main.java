import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        System.out.println("Enter points totals, -1 stops:");
        while (true) {
            int inputPoints = Integer.valueOf(scanner.nextLine());
            if (inputPoints == -1) {
                break;
            } else if (inputPoints >= 0 && inputPoints <= 100) {
                nums.add(inputPoints);
            }
        }

        int sum = 0;
        int sumOfPass = 0;
        int totalSumOfPass = 0;

        int[] grades = new int[6];
        for (int num: nums) {
            sum += num;

            if (num > 49) {
                sumOfPass += num;
                totalSumOfPass++;
            }

            if (num < 50) {
                grades[5]++;
            } else if (num < 60) {
                grades[4]++;
            } else if (num < 70) {
                grades[3]++;
            } else if (num < 80) {
                grades[2]++;
            } else if (num < 90) {
                grades[1]++;
            } else if (num > 90) {
                grades[0]++;
            }
        }

        double average = (double) sum / nums.size();
        System.out.println("Point average (all): " + average);

        if (sumOfPass == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + 1.0 * sumOfPass / totalSumOfPass);
        }
        
        double passed = (double) 100 * totalSumOfPass / nums.size();
        System.out.println("Pass percentage: " + passed);

        System.out.println("Grade distribution:");
        int gradeIndex = 5;
        for (int grade: grades) {
            System.out.print(gradeIndex + ": ");

            for (int i = 0; i < grade; i++) {
                System.out.print("*");
            }
            System.out.println();
            gradeIndex--;
        }

        scanner.close();
    }
}
