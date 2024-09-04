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

    /* Implementing the equals method, and over riding the default equal method */
    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place they are same
        if (this == comparedObject) return true;

        // if the comparedObject are not of the book type then they are not same
        if (!(comparedObject instanceof Book)) return false;

        // lets convert the objects to a Book-olioksi
        Book comparedBook = (Book) comparedObject;

        // if the instance variables of the object are same, so are the objects
        if (this.name.equals(comparedBook.name) &&
            this.published == comparedBook.published &&
            this.content.equals(comparedBook.content)) return true;
        
        // otherwise the objects are not same
        return false;
    }

    /* Rewriting the hashCode method
     * If the name here is null then we will get a NullPointerException, that's why we will return the published year if the name is null
    
     * But then, all of the books that share a name are bundled into one group. So, we improved it further by taking into account the year of publication is also  in the hash value calculation that's based on the book title.
     */
    @Override
    public int hashCode() {
        if (this.name == null) return this.published;

        return this.published + this.name.hashCode();
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
