import java.util.ArrayList;

public class IntermidiateOperations {
    public class Person {
        private String firstName;
        private String lastName;
        private int birthYear;
    
        public Person(String firstName, String lastName, int birthYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthYear = birthYear;
        }
    
        public String getFirstName() {
            return this.firstName;
        }
    
        public String getLastName() {
            return this.lastName;
        }
    
        public int getBirthYear() {
            return this.birthYear;
        }
    }
    public static void main(String[] args) {
        // we are given a list of object of type person
        ArrayList<Person> persons = new ArrayList<>();
        
        // Print the number of persons born before the year 1970.
        long count = persons.stream().filter(person -> person.getBirthYear() < 1970).count();
        System.out.println("Count: " + count);

        //  How many persons' first names start with the letter "A"?
        long counting = persons.stream().filter(person -> person.getFirstName().startsWith("A")).count();
        System.out.println(counting + " person name starts with A.");

        // Print the number of unique first names in alphabetical order
        persons.stream().map(person -> person.getFirstName()).distinct().sorted().forEach(name -> System.out.println(name));
        /* Explanation for above part
         * First we used the map method to change a stream containing person objects into a stream containing first names. After that we called the distinct-method, that returns a stream that only contains unique values. Next, we call the method sorted, which sorts the strings. Finally, we call the method forEach, that is used to print the strings.
         */
    }
}
