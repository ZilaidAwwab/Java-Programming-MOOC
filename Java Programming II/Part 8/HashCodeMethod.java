import java.util.HashMap;

public class HashCodeMethod {
    public static void main(String[] args) {
        HashMap<Book, String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");

        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
        System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "...")));

        /* Print
         * Pekka
         * null
         * null
         */

         /*
          * The reason lies in the default implementation of the hashCode method in the Object class (Book class here). The default implementation creates a hashCode value based on the object's reference, which means that books having the same content that are nonetheless different objects get different results from the hashCode method. As such, the object is not being searched for in the right place.

          * The class that the key belongs to must overwrite the hashCode method in addition to the equals method. The method must be overwritten so that it gives the same numerical result for all objects with the same content. Also, some objects with different contents may get the same result from the hashCode method. However, with the HashMap's performance in mind, it is essential that objects with different contents get the same hash value as rarely as possible.
          */

          /* Now after implementing the hashCode in the Book class, it's now possible to use the book as the hash map's key. This way the problem we faced earlier gets solved and the book borrowers are found: */

          /* Now the above program prints
           * Pekka
           * Pekka
           * Arto
           */
    }
}
