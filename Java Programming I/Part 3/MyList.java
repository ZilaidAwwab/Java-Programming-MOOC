import java.util.ArrayList;

public class MyList {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);

    int integer = 24;
    list.add(integer); // valid

    ArrayList<String> stringList = new ArrayList<>();
    // Adding and retrieving from list
    stringList.add("Hey, I am the new string created");
    stringList.add("First");
    stringList.add("Second");

    // Retrieving individual element
    System.out.println(stringList.get(1));

    // Knowing the size (or number of elements contained) in the list
    System.out.println("The size of the string Array is " + stringList.size());
  }
}
