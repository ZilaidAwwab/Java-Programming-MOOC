import java.util.ArrayList;

public class Box implements Packable {
    private double weight;
    private ArrayList<Packable> packages;

    public Box(double weight) {
        this.weight = weight;
        this.packages = new ArrayList<>();
    }

    public void add(Packable newItem) {
        if (this.weight() + newItem.weight() <= this.weight) {
            this.packages.add(newItem);
        }
    }

    @Override
    public double weight() {
        double sum = 0;
        for (Packable item: this.packages) {
            sum += item.weight();
        }
        return (double) sum;
    }

    @Override
    public String toString() {
        return "Box: " + packages.size() + " items, total weight " + this.weight() + " kg";
    }
}
