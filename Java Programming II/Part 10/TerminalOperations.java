/*
 * The terminal operations have 4 methods
 * count
 * forEach
 * reduce
 * collect
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        
        /* The count method
         * returns the number of values in a stream in a long type variable
         */
        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(54);
        values.add(23);
        values.add(12);
        values.add(65);
        values.add(43);

        System.out.println("Values: " + values.stream().count()); // 6

        /* The forEach method
         * The forEach method defines what is done to each list value and terminates the stream processing
         */
        values.stream().filter(val -> val % 2 == 0).forEach(val -> System.out.println(val)); // 4, 54, 12

        /* The collect method
         * You can use the collect method to collect stream values into another collection. The example below creates a new list containing only positive values. The collect method is given as a parameter to the Collectors object to which the stream values ​​are collected - for example, calling Collectors.toCollection(ArrayList::new) creates a new ArrayList object that holds the collected values.
         */
        ArrayList<Integer> positives = values.stream().filter(val -> val > 0).collect(Collectors.toCollection(ArrayList::new));
        positives.stream().forEach(val -> System.out.println(val)); // prints all nums (greater than 0)

        /* The reduce method
         * The reduce method is useful when you want to combine stream elements to some other form. The parameters accepted by the method have the following format: 
        
        ***reduce(*initialState*, (*previous*, *object*) -> *actions on the object*).
        
         * As an example, you can calculate the sum of an integer list using the reduce method as follows
         */
        int sum = values.stream().reduce(0, (previouSum, val) -> previouSum + val);
        System.out.println(sum); // prints the sum of all the values in the list (by adding the current value with the previous one)

        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String combined = words.stream().reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(combined);
        /* Prints
         * First
         * Second
         * Third
         * Fourth
         */
    }
}
