public class ArithmeticOperation {
  public static void main(String[] args) {
    int x = 12;
    int y = 4;
    double z = 3.0;

    // when both are int
    int result1 = x / y; // 3
    System.out.println(result1);


    // when anyone is a float
    double result2 = x / z; // 4.0
    System.out.println(result2);


    // We can convert any int to double as well
    double result3 = (double) x / y; // 3.0
    System.out.println(result3);

    double result4 = x / (double) y; // 3.0
    System.out.println(result4);

    double result5 = (double) (x / y); // 3.0
    System.out.println(result5);


    // we can also convert double to int
    int result6 = x / (int) z; // 4
    System.out.println(result6);


    // we can also do this
    double result7 = 1.0 * x / y; // 3.0
    System.out.println(result7);


    int dividend = 3;
    int divisor = 2;
    
    // The position of the double (1.0 here), matters as we can see this
    double result8 = dividend / divisor * 1.0; // 1.0
    System.out.println(result8);

    double result9 = 1.0 * dividend / divisor; // 1.5
    System.out.println(result9);
  }
}
