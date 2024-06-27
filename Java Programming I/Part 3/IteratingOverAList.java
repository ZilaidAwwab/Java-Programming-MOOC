import java.util.ArrayList;

public class IteratingOverAList {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("Messi");
    stringList.add("Ronaldo");
    stringList.add("Hazard");
    stringList.add("Neymar");

    // Iterating over the list
    int index = 0;

    while (index < stringList.size()) {
      System.out.println(stringList.get(index));
      index++;
    }

    System.out.println("");
    
    // Using for loop for the same task
    for (int i = 0; i < stringList.size(); i++) {
      System.out.println(stringList.get(i));
    }
    
    System.out.println("");

    // Reversing the items of the list
    for (int j = stringList.size() - 1; j >= 0; j--) {
      System.out.println(stringList.get(j));
    }
  }
}
