import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> storageItems = this.storage.get(unit);
        storageItems.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        for (String searchTerm: this.storage.keySet()) {
            if (searchTerm.equals(storageUnit)) {
                return (this.storage.get(storageUnit));
            }
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> allUnits = new ArrayList<>();
        for (String name: storage.keySet()) {
            allUnits.add(name);
        }
        return allUnits;
    }
}
