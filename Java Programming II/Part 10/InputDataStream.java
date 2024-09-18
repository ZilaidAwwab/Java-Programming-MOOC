/*
 * In this program we will take the stream of data as input from the user and will perform certain operation on that data without changing the data
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputDataStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Here list in the interface on the ArrayList class and as we studied that an interface type can be used on the class object.
        List<String> inputs = new ArrayList<>();

        // reading input from user
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) break;
            inputs.add(row);
        }

        // Here we are going to perform 2 operations on the input data

        // 1. counting the number of values divisible by 3
        long numbersDivisibleByThree = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number % 3 == 0).count();

        // 2. working on the average
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();

        // printing the stats obtained
        System.out.println("Divisible by 3: " + numbersDivisibleByThree);
        System.out.println("Average number: " + average);

        scanner.close();
    }
}
