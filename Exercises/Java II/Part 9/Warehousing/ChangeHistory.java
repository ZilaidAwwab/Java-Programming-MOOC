import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double maxVal = 0.0;
        if (this.history.isEmpty()) {
            return maxVal;
        }
        for (Double price: history) {
            if (price > maxVal) {
                maxVal = price;
            }
        }
        return maxVal;
    }

    public double minValue() {
        double temp = history.get(0);
        if (this.history.isEmpty()) {
            return temp;
        }
        for (Double price: history) {
            if (price < temp) {
                temp = price;
            }
        }
        return temp;
    }

    public double average() {
        double values = 0.0;
        int count = 0;
        if (this.history.isEmpty()) {
            return values;
        }
        for (Double price: history) {
            count++;
            values += price;
        }
        return (double) values / count;
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
