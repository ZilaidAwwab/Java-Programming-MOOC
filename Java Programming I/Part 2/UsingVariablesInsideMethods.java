public class UsingVariablesInsideMethods {
  public static void main(String[] args) {
    average(12, 43, 21);
  }

  public static double average(int num1, int num2, int num3) {

    // Here we have defined the sum and avg variables fresh inside this method, and they are only accessible inside this method (the method in which they are defined)
    int sum = num1 + num2 + num3;
    double avg = sum / 3.0;

    return avg;
  }
}
