public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyObj = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        historyObj.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        double result = 0;
        result = (double) super.getBalance() + amount;
        historyObj.add(result);
        super.addToWarehouse(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;
        result = (double) super.getBalance() - amount;
        historyObj.add(result);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + historyObj.maxValue());
        System.out.println("Smallest amount of product: " + historyObj.minValue());
        System.out.println("Average: " + historyObj.average());
    }

    public String history() {
        return historyObj.toString();
    }
}
