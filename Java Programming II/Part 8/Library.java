import java.util.ArrayList;
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

    /* Going through a HashMap's Keys */
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = titlePart.toLowerCase().trim();
        ArrayList<Book> books = new ArrayList<>();

        for (String bookTitle: this.directory.keySet()) {
            if (!bookTitle.contains(titlePart)) {
                continue;
            }
            books.add(this.directory.get(bookTitle));
        }
        return books;
    }
    
    /* Going through a HashMap's Values */
    public ArrayList<Book> getBookValuesByPart(String titlePart) {
        titlePart = titlePart.toLowerCase().trim();
        ArrayList<Book> books = new ArrayList<>();

        // Herer we are using the Book data type instead of String (as in key finder)
        for (Book book: this.directory.values()) {
            if (!book.getName().contains(titlePart)) {
                continue;
            }
            books.add(this.directory.get(titlePart));
        }
        return books;
    }
}
