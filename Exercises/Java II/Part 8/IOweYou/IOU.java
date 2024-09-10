import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashMap;

    public IOU() {
        this.hashMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.hashMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.hashMap.getOrDefault(toWhom, 0.0);
    }
}
