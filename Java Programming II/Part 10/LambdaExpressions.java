public class LambdaExpressions {
    public static void main(String[] args) {
        /*
        long numbersDivisibleByThree = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number % 3 == 0).count();
    
        * Here the filter method's argument is a lambda expression and this is equalent to

        .filter((Integer number) -> {
             if (number % 3 == 0) {
                 return true;
             }
             return false;
        }).mapToInt...

        */

        /*
         * We can also define a class and use its method, or methods coming from the library as a lambda expression
        
        public class Screeners {
            public static boolean greaterThanFive(int value) {
            return value > 5;
            }
        }
        
        // We can use it in several ways
        **stream.filter(value -> value > 5).furtherActions...

        // Now this can be expressed as,
        ***stream.filter(value -> Screeners.greaterThanFive(value)).furtherActions
        
        // Another way
        ***stream.filter(Screeners::greaterThanFive).furtherActions

        **The syntax above Screeners::greaterThanFive is saying: "use the static greaterThanFive method that's in the Screeners class".

         */

        /*
        int numberOfMappedValues = 0;

        // determining the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
            .mapToInt(s -> {
                // variables declared outside of an anonymous function cannot be used, so this won't work
                numberOfMappedValues++; // This is unreachable and thus won't increment
                
                return Integer.valueOf(s);
            }).filter(value -> value % 3 == 0)
            .count();
         */
    }
}
