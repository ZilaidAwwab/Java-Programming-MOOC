import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.keySet().contains(product)) {
            increaseQuantity(product);
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }
    
    private void increaseQuantity(String product) {
        // here in the first part we accessed the item (via the product name key), then we accessed the increase quantity method of the item
        this.items.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;
        for (Item e: items.values()) {
            totalPrice += e.price();
        }
        return totalPrice;
    }

    public void print() {
        for (String e: items.keySet()) {
            System.out.println(items.get(e).toString());
        }
    }
}
