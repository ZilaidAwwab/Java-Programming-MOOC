import java.util.ArrayList;

public class ForEachLoop {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    // Adding items
    names.add("Muhammad");
    names.add("Ali");
    names.add("Zahra");
    names.add("Husnain");

    for (String name: names) {
      System.out.println(name);
    }
  }
}
