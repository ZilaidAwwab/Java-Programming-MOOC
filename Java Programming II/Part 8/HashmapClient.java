import java.util.HashMap;

public class HashmapClient {
    public static void main(String[] args) {
        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("OO710", "Helsinki");
        postalCodes.put("90010", "Oulu");
        postalCodes.put("33721", "Tampere");
        postalCodes.put("98793", "Haiken");

        System.out.println(postalCodes.get("OO710"));

        /* This will return null (as this key is not in the hashmap) */
        System.out.println(postalCodes.get("00120"));
    }
}
