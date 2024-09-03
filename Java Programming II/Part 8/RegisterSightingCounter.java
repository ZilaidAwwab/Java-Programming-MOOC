import java.util.HashMap;

public class RegisterSightingCounter {
    private HashMap<String, Integer> allSightings;

    public RegisterSightingCounter() {
        this.allSightings = new HashMap<>();
    }

    public void allSighting(String sighted) {
        if (!this.allSightings.containsKey(sighted)) {
            this.allSightings.put(sighted, 0);
        }

        int timesSighted = this.allSightings.get(sighted);
        timesSighted++;
        this.allSightings.put(sighted, timesSighted);
    }

    /* this could give error while type conversion
    public int timesSighted(String sighted) {
        return this.allSightings.get(sighted);
    }
    */
    
    /* To avoid errors we do some modifications in the above method */
    public int timesSighted(String sighted) {
        return this.allSightings.getOrDefault(sighted, 0);
    }

    /* this above method is similar to this 
    public int timesSighted(String sighted) {
        if (this.allSightings.containsKey(sighted)) {
            return this.allSightings.get(sighted);
        }
        return 0;
    }
    */
}
