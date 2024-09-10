import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String keys: hashmap.keySet()) {
            System.out.println(keys);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        text = cleanString(text);
        for (String keys: hashmap.keySet()) {
            if (!keys.contains(text)) {
                continue;
            }
            System.out.println(keys);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        text = cleanString(text);
        for (String keys: hashmap.keySet()) {
            if (!keys.contains(text)) {
                continue;
            }
            System.out.println(hashmap.get(keys));
        }
    }

    private static String cleanString(String text) {
        if (text == null) return "";
        return text.toLowerCase().trim();
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
