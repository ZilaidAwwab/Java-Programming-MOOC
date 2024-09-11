/*
 * Interface as a method parameter
 * 
 * The true benefits of interfaces are reaped when they are used as the type of parameter provided to a method. Since an interface can be used as a variable's type, it can also be used as a parameter type in method calls.
 * 
 * The value of the print method of the printer class lies in the fact that it can be given any class that implements the Readable interface as a parameter. Were we to call the method with any object instantiated from a class that inherits the Readable class, the method would function as desired.
 */

import java.util.ArrayList;

public class Printer {
    public void print(Readable readable) {
        System.out.println(readable.read());
    }

    public static void main(String[] args) {
        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");
        
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        Ebook book = new Ebook("Introduction to University Mathematics.", pages);

        Printer printer = new Printer();

        // Since text message and ebook class implements readable interface, that's why the object instantiated with the text message (or ebook) class can be passed to a method that required readable type
        printer.print(message);
        printer.print(book);
    }
}
