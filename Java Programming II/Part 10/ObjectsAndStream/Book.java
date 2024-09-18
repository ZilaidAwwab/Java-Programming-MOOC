package ObjectsAndStream;

import java.util.ArrayList;

public class Book {
    private Person author;
    private String name;
    private int pages;

    public Book(Person author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public Person getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    /*
     * Calculating the average of the authors' birth years can be done using stream methods in a way that feels natural. 
     * First, we convert the stream of books to a stream of persons.
     * Then we convert the stream of person to a stream of birth years. 
     * Finally, we ask the (integer) stream for an average.
     */

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        double average = books.stream().map(book -> book.getAuthor()).mapToInt(author -> author.getBirthYear()).average().getAsDouble();

        // this could be done on a single map call
        // double average = books.stream().mapToInt(book -> book.getAuthor().getBirthYear())

        System.out.println("Average of the author's birth years: " + average);

        // Similarly, the names of the authors of books with the word "Potter" in their titles are outputted the following way.
        books.stream().filter(book -> book.getName().contains("Potter")).map(book -> book.getAuthor()).forEach(author -> System.out.println(author));

        // Streams can also be used to build more complex string representations. In the example below, we print "Author Name: Book" pairs arranged in alphabetical order.
        books.stream().map(book -> book.getAuthor().getName() + ": " + book.getName()).sorted().forEach(name -> System.out.println(name));
    }
}
