import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    /* Helper Method */
    public int currentAmount() {
        int weight = 0;
        for (Item presentItems: items) {
            weight += presentItems.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
