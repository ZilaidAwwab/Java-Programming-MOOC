import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = book.getName();

        /* The code in the next 3 lines can be made a standalone method to make the code clean and to use this in other methods as well (for removing and getting books) */
        if (name == null) name = "";
        name = name.toLowerCase();  // to convert the sting to small letters
        name = name.trim();         // remove empty characers from beginning and end

        /* The containsKey method check whether the key exists in the hashamp */
        if (this.directory.containsKey(name)) {
            System.out.println("Book is already in the library.");
        } else {
            directory.put(name, book);
        }
    }
}
