public class EqualMethod {
    public static void main(String[] args) {
        Book bookObject = new Book("Book object", 2000, "...");
        Book anotherBook = bookObject;
    
        /* This will print same, as both are the same object, with different pointers, so here the reference is same for both objects */
        if (bookObject.equals(anotherBook)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        
        /* Here we have created the new object with the same arguments, but this will print different, as there pointers are not pointing to the same position  */
        anotherBook = new Book("Book object", 2000, "...");
        
        if (bookObject.equals(anotherBook)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        /* This is definitely a unexpected behavior, and the reason is the equal mehtod of string data type, so we'll define our own equal method in the book class with the attributes mentioned over there */

        /* After the implementation of the overridden equals method in the Book class now these both will return Same, means true, indicating that both the objects are equal */
    }
}
