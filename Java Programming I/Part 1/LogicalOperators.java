public class LogicalOperators {
  public static void main(String[] args) {
    
    // AND operator
    int number = 7;
    if (number > 5 && number < 10) {
      System.out.println("The number is in between 5-10");
    } else {
      System.out.println("The number is not in the given range");
    }

    // OR operator
    int value = 125;
    if (value < 0 || value > 100) {
      System.out.println("The number is either a negative integer or greater than 100");
    } else {
      System.out.println("The number is a value between 1-100");
    }

    // NOT operator
    int num = 7;
    if (!(num > 5)) {
      System.out.println("The number is not greater than 5");
    } else {
      System.out.println("The number is greater than 5");
    }
  }
}
