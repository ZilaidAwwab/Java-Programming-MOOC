package RegularExpressions;

/* Alternation or Vertical Line */
public class Alternation {
    public static void main(String[] args) {

        /*
         * A vertical line indicates that parts of a regular expressions are 
         * optional. For example, 00|111|0000 defines the strings 00, 111 and 0000. 
         * The respond method returns true if the string matches any one of the 
         * specified group of alternatives.
         */

        String string = "00";   // matches

        if(string.matches("00|111|0000")) {
            System.out.println("The string contained one of these three alternatives");
        } else {
            System.out.println("The string doesnt contains anyone of these three alternatives");
        }

        /*
         * The regular expression 00|111|0000 demands that the string is exactly 
         * it specifies it to be - there is no "contains" functionality.
         */

         String strings = "1111";   // doesnt match (becasue had to be exactly like this)

         if(strings.matches("00|111|0000")) {
             System.out.println("The string contained one of these three alternatives");
         } else {
             System.out.println("The string doesnt contains anyone of these three alternatives");
         }
    }
}
