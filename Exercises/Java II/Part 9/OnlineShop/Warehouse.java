import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stock(product) > 0) {
            // removing 1 item of the product from the stock
            stock.put(product, stock.get(product)-1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> items = new HashSet<>();
        for (String item: prices.keySet()) {
            items.add(item);
        }
        return items;
    }
}
