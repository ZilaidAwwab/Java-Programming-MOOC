public class SizeAndIterationOverArray {
  public static void main(String[] args) {
    int[] numbers = new int[4];
    numbers[0] = 212;
    numbers[1] = 321;
    numbers[2] = 8923;
    numbers[3] = 543;

    // Here we are using the length variable (numbers.length) to find the length of the array
    System.out.println("Number of items in the array are: " + numbers.length);

    // Here we are iterating over the array
    int index = 0;
    while (index < numbers.length) {
      System.out.println(numbers[index]);
      index++;
    }
  }
}
