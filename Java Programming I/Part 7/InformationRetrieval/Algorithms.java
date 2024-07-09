package InformationRetrieval;

public class Algorithms {
  public static void main(String[] args) {
    int[] nums = {3, 6, 8, 1, 4, 2, 0, 9, 7, 5};
    System.out.println(LinearSearch(nums, 4));
    
  }

  public static int LinearSearch(int[] array, int searched) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == searched) {
        return i;
      }
    }
    return -1;
  }
}
