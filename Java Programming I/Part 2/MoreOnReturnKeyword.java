public class MoreOnReturnKeyword {
  public static void main(String[] args) {
    
  }

  public static int faultyMethod() {
    return 10;
    // This statement wont execute and will return an error
    // System.out.println("Hey, I am afte the return.");
  }

  public static int functionMethod(int parameter) {
    if (parameter > 10) {
      return 10;
    }

    // Here these below statements will work
    System.out.println("The number received as param is greater than 10");
    return parameter;
  }

  // The void method can also use return statements, but they are used with out any value just to stop the execution of program at that place
  public static void division(int numerator, int denominator) {
    if (denominator < 0) {
      System.out.println("Cannot divide by 0!");
      return; // here return just stop the execution in this code block
    }

    System.out.println("Answer: " + (1.0 * numerator / denominator));
  }
}
