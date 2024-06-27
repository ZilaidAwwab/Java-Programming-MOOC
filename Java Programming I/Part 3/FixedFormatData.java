import java.util.Scanner;

public class FixedFormatData {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the name and the age separated by a comma.");

    while (true) {
      String inputValue = scanner.nextLine();
      if (inputValue.equals("")) {
        break;
      } else {
        String[] splStrings = inputValue.split(",");
        System.out.println("Name: " + splStrings[0] + ", age: " + splStrings[1]);
      }
    }
    scanner.close();
  }
}
// Here we have splitted the names and ages, but both of them are still strings, but we can convert the nums in to int data type where the string is of fixed length. And then we can compute the sum and averages of the age

// int ages = Integer.valueOf(splStrings[1]);
