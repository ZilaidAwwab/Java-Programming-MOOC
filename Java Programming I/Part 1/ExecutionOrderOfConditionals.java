import java.util.Scanner;

public class ExecutionOrderOfConditionals {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any number:");
    int number = Integer.valueOf(scan.nextLine());

    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if (number % 3 == 0) {
      System.out.println("Fizz");
    } else if (number % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(number);
    }
    scan.close();
  }
}

/*
Here we could've used this approach as well

if (number % 3 == 0) {
    System.out.println("Fizz");
} else if (number % 5 == 0) {
    System.out.println("Buzz");
} else if (number % 3 == 0 && number % 5 == 0) {
    System.out.println("FizzBuzz");
} else {
    System.out.println(number);
}

But the issue in this is that here if the number was divisible by either 3 or 5 then that would've printed the Fizz or Buzz without checking the condition for FizzBuzz, so we need to number our conditions properly in order to get through the whole number of conditions that are possible, and following this we can sometime follow specific to general and sometimes general to specific appraoch.
 */
