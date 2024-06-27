import java.util.ArrayList;

public class ContainsArrayMethods {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("first");
    list.add("Second");
    list.add("Third");

    boolean found = list.contains("Second");

    if (found) {
      System.out.println("Second was found");
    }
  }
}
