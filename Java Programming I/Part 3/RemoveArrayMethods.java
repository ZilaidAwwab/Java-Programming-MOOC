import java.util.ArrayList;

public class RemoveArrayMethods {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("first");
    list.add("Second");
    list.add("Third");

    // Removing items (It also starts from the index 0)
    list.remove(1);

    System.out.println(list.get(0)); // first
    System.out.println(list.get(1)); // third

    /*
    If the list contains integers, you cannot remove a number value by giving an int type parameter to the remove method. This would remove the number from the index that the parameter indicates, instead of an element on the list that has the same value as the parameter. To remove an integer type value you can convert the parameter to Integer type; this is achieved by the valueOf method of the Integer class.
    */
    ArrayList<Integer> ints = new ArrayList<>();
    ints.add(0);
    ints.add(1);
    ints.add(2);
    ints.add(3);
    ints.add(4);
    ints.add(15);
    ints.add(5);

    // If we directly pass the number 5 then the value at index 5 i-e: 15 will be removed that's why we need to convert it to type Integer (as that is the type defined at the time of ArrayList initialization)
    ints.remove(Integer.valueOf(5));

    System.out.println(ints.get(5)); // 15
  }
}
