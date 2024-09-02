/* A reference type as a hashmap value */

import java.util.ArrayList;
import java.util.HashMap;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n" + "Content: " + this.content;
    }

    public static void main(String[] args) {
        /* Normal use */
        Book hook = new Book("Hook", 1921, "Some thing happens for our good.");
        Book theGovernables = new Book("The Governables", 2009, "Discussing the politics.");

        HashMap<String, Book> library = new HashMap<>();
        library.put(hook.getName(), hook);
        library.put(theGovernables.getName(), theGovernables);

        System.out.println(library);

        System.out.println(library.get("The Governables"));

        /* More advance use */
        ArrayList<Book> books = new ArrayList<>();
        books.add(theGovernables);
        books.add(hook);

        // searching for the book in the list
        Book match = null;
        for (Book book : books) {
            if (book.getName().equals("The Governables")) {
                match = book;
                break;
            }
        }

        System.out.println(match);
    }
}
