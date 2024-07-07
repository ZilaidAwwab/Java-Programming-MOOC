import java.util.ArrayList;

public class Hold {
  private int maxWeight;
  private ArrayList<Suitcase> hold;


  public Hold(int maxWeight) {
    this.maxWeight = maxWeight;
    this.hold = new ArrayList<>();
  }


  public int totalWeight() {
    int totalWeight = 0;

    for (Suitcase suitcase: hold) {
      totalWeight += suitcase.totalWeight();
    }

    return totalWeight;
  }


  public void addSuitcase(Suitcase suitcase) {
    int weight = totalWeight();

    if (weight + suitcase.totalWeight() <= maxWeight) {
      this.hold.add(suitcase);
    }
  }


  public void printItems() {
    if (this.hold.isEmpty()) {
      System.out.println("No items in there.");
    }

    for (Suitcase item: hold) {
      item.printItems();
    }
  }


  public String toString() {
    return hold.size() + " suitcases (" + totalWeight() + " kg)";
  }
}
