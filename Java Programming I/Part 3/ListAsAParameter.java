import java.util.ArrayList;

public class ListAsAParameter {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("first");
    list.add("second");
    list.add("third");

    // Calling the print method defined below
    print(list);
  }


  public static void print(ArrayList<String> list) {
    for (String value: list) {
      System.out.println(value);
    }
  }
}
