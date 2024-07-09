import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BuiltInSorting {
  public static void main(String[] args) {

    // We can sort the array using the Arrays.sort method of the Array class
    int[] numbers = {4, 7, 1, 8, 2, 5, 9, 6, 3};
    System.out.println(Arrays.toString(numbers));
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    // We can sort the list using the Collections.sort method of the Collections class (remember Collections and Collection are different)
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(8);
    nums.add(3);
    nums.add(5);
    nums.add(9);
    System.out.println(nums);
    Collections.sort(nums);
    System.out.println(nums);
  }
}
