import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistration;

    public VehicleRegistry() {
        this.vehicleRegistration = new HashMap();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate plates: vehicleRegistration.keySet()) {
            if (plates.equals(licensePlate)) {
                return false;
            }
        }
        vehicleRegistration.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.vehicleRegistration.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!vehicleRegistration.containsKey(licensePlate)) {
            return false;
        }
        vehicleRegistration.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate plates: vehicleRegistration.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner: vehicleRegistration.values()) {
            if (!ownerList.contains(owner)) {
                ownerList.add(owner);
            }
        }
        for (String owners: ownerList) {
            System.out.println(owners);
        }
    }
}
