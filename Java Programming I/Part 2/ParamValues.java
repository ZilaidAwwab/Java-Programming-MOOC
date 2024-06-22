public class ParamValues {
  public static void main(String[] args) {
    int num1 = 23;
    int num2 = 17;
    sum(num1, num2); // here num1 = 23

    num1 = 33;
    sum(num1, num2); // here num2 = 33
  }

  public static void sum(int num1, int num2) {
    System.out.println("Sum is: " + (num1 + num2));
  }
}
