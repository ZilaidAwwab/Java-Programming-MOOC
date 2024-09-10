import java.util.ArrayList;
import java.util.HashMap;

public class GroupingValuesInHashmap {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();

        // we can attach an empty list initially to a key
        phoneNumbers.put("Pekka", new ArrayList<>());

        // adding phone number to the list
        phoneNumbers.get("Pekka").add("020-9283742");
        
        // adding another number
        phoneNumbers.get("Pekka").add("091-342342");

        System.out.println("Pekka's Number: " + phoneNumbers.get("Pekka"));
        /*
         * Pekka's Number: [020-9283742, 091-342342]
         */
    }
}
