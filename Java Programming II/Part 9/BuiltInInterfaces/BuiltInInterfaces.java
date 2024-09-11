import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BuiltInInterfaces {
    public static void main(String[] args) {
        /*
        @LIST INTERFACE
         * The List interface, implemented on the ArrayList and LinkedList, works same if we take this as a variable type instead of array list, or linked list
         */
        List<String> strings = new ArrayList<>();
        strings.add("String objects inside of a List interface");
    
        List<String> books = new LinkedList<>();
        books.add("Crime and Punishment!!!");
    
        /*
        @MAP INTERFACE
         * The Map interface implemented on the HashMap, works similar
         */
        Map<String, String> authors = new HashMap<>();
        authors.put("Doestovsky", "1882");
        authors.put("kafka", "1921");

        for (String names: authors.keySet()) {
            System.out.println(names + " (" + authors.get(names) + ")");
        }

        /*
        @SET INTERFACE
         * This is implemented on the HashSet
         */
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element: set) {
            System.out.println(element);
        }
        /*
         * The above would print
         * one
         * two
          
         * This is because the set dont accepts duplicates, and ignore the duplicates before adding to its list. So, if we have a list of duplicates and we want unique elements to get stored or displayed then we use set.
         */

        /*
        @COLLECTION INTERFACE
         * The Collection interface also determines how the collection is iterated over. Any class that implements the Collection interface
         */

        Map<String, String> translations = new HashMap<>();
        translations.put("ganbatte", "good luck");
        translations.put("hai", "yes");
         
        Set<String> keys = translations.keySet();
        // Collection Interface imp: 1
        Collection<String> keyCollection = keys; 
         
        System.out.println("Keys:");
        for (String key: keyCollection) {
            System.out.println(key);
        }
         
        System.out.println();
        System.out.println("Values:");
        // Collection Interface imp: 2
        Collection<String> values = translations.values(); 
         
        for (String value: values) {
            System.out.println(value);
        }
    }

}
