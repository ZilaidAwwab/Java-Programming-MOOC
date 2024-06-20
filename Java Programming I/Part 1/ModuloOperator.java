import java.util.Scanner;

public class ModuloOperator {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    int number = Integer.valueOf(reader.nextLine());
    int remainder = number % 400;
    
    if (remainder == 0) {
      System.out.println("The number " + number + " is divisible by four hundred.");
    } else {
      System.out.println("The number " + number + " is not divisible by four hundred.");
    }

    reader.close();
  }
}
