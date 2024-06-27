public class CreatingAnArray {
  public static void main(String[] args) {
    
    // Creating an array in a shorter method
    int[] nums = {100, 120, 54};
    String[] names = {"Zamborata", "Makelele", "Zenneti"};
    double[] heights = {6.3, 5.9, 6.0};

    for (int i = 0; i < nums.length; i++) {
      System.out.println(names[i] + "'s height is " + heights[i] + " and his market value is " + nums[i] + " Million.\n");
    }
  }
}
