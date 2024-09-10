import java.util.HashMap;

public class Program {
    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book book: hashMap.values()) {
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        text = cleanString(text);
        for (Book book: hashmap.values()) {
            if(!book.getName().contains(text)) {
                continue;
            }
            System.out.println(book);
        }
    }

    private static String cleanString(String text) {
        if (text == null) return "";
        return text.toLowerCase().trim();
    }

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}
