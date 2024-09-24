package RegularExpressions;

import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* We are checking whether the number provided by the user
         * is according to the standard number assigned to the students
         */
        System.out.println("Provide a student number");
        String number = scanner.nextLine();

        /* we want a number starting with the code "01" common for every student
         * and then a 7 digit number where every digit is a number from 0-9
         */
        if(number.matches("01[0-9]{7}")) {
            System.out.println("Correct format");
        } else {
            System.out.println("Incorrect format");
        }

        scanner.close();
    }
}
