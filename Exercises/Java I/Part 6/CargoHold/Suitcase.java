import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> items;
  // private ArrayList<Integer> maxWeight;
  private int maxWeight;

  
  public Suitcase(int maxWeight) {
    this.items = new ArrayList<>();
    this.maxWeight = maxWeight;
  }

  
  // Helper method
  public int totalWeight() {
    int totalWeight = 0;

    for (Item item: items) {
      totalWeight += item.getWeight();
    }

    return totalWeight;
  }

  
  public void addItem(Item item) {
    int weight = totalWeight();

    if (weight + item.getWeight() <= maxWeight) {
      items.add(item);
    }
  }

  
  public void printItems() {
    for (Item item: items) {
      System.out.println(item);
    }
  }

  
  public Item heaviestItem() {
    if (this.items.isEmpty()) {
      return null;
    }

    Item heaviestItem = this.items.get(0);
    
    for (Item item: items) {
      if (heaviestItem.getWeight() < item.getWeight()) {
        heaviestItem = item;
      }
    }
    return heaviestItem;
  }


  public String toString() {
    if (this.items.isEmpty()) {
      return "no items (" + totalWeight() + " kg)"; 
    }

    if (this.items.size() == 1) {
      return items.size() + " item (" + totalWeight() + " kg)"; 
    }

    return items.size() + " items (" + totalWeight() + " kg)"; 
  }
}
