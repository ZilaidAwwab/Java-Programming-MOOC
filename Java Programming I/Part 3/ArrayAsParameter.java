public class ArrayAsParameter {
  public static void main(String[] args) {
    int[] intergerNums = new int[5];
    intergerNums[0] = 212;
    intergerNums[1] = 430;
    intergerNums[2] = 657;
    intergerNums[3] = 987;
    intergerNums[4] = 343;

    listElements(intergerNums);
  }

  public static void listElements(int[] intergerNumbers) {
    System.out.println("The elements of array are:");
    int index = 0;
    while (index < intergerNumbers.length) {
      System.out.println(intergerNumbers[index]);
      index++;
    }
  }
}
