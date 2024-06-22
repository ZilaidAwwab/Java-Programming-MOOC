public class MethodWithParameter {
  public static void main(String[] args) {
    
    greet(3);

    // We can also pass an expression in place of parameter
    // greet(1+2); (This also equates to 3)
  }

  public static void greet(int numOfTimes) {
    int i = 0;
    while (i < numOfTimes) {
      System.out.println("Greetings!");
      i++;
    }
  }
}
