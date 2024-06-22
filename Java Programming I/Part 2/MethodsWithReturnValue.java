public class MethodsWithReturnValue {
  public static void main(String[] args) {

    // For the return value to be used, it must be stored in a variable
    int number = returnsTen();
    System.out.println("The number we are looking for is " + number);

    // We can use the returned value and can make a expression out of it
    int average = (returnsTen() + returnsTen()) / 2;
    System.out.println("The average is " + average);
  }

  public static int returnsTen() {

    // The methods that returns a value should have a return statement that contain a return keyword before the returning value, or the variable that holds the value (which we want to return)
    return 10;
  }
}
