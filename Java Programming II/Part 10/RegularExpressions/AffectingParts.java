package RegularExpressions;

public class AffectingParts {
    public static void main(String[] args) {
        /*
         * You can use parentheses to determine which part of a regular expression 
         * is affected by the rules inside the parentheses. Say we want to allow the 
         * strings 00000 and 00001. We can do that by placing a vertical bar in 
         * between them this way 00000|00001. Parentheses allow us to limit the 
         * option to a specific part of the string. The expression 0000(0|1) 
         * specifies the strings 00000 and 00001.
         
         * Similarly, the regular expression car(|s|) defines the singular (car) and * plural (cars) forms of the word car.
         */

        String string = "trolololololo";    // correct
        /* The quantifier * repeats 0 ... times */

        if(string.matches("trolo(lo)*")) {  // 1st quantifier
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        
        String string2 = "nanananana Batman!";  // correct
        /* The quantifier + repeats 1 ... times */

        if(string2.matches("(na)+Batman!")) {  // 2nd quantifier
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        String string3 = "You have to accidentally the whole meme";    // correct
        /* The quantifier ? repeats 0 or 1 times */

        if(string3.matches("You have to accidentally (delete )?the whole meme")) {  // 3rd quantifier
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        String string4 = "1010";    // correct
        /* The quantifier {a} repeats a times */

        if(string4.matches("(10){2}")) {    // 4th quantifier
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        String string5 = "1";   // incorrect
        /* The quantifier {a,b} repeats a ... b times */

        if(string5.matches("(1){2, 4}")) {    // 5th quantifier
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        String string6 = "11111";   // correct
        /* The quantifier {a,} repeats a ... times */

        if(string6.matches("(1){2,}")) {    // 6th quantifier
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        /*
         * You can use more than one quantifier in a single regular expression. For example, the regular 
         * expression 5{3}(1|0)*5{3} defines strings that begin and end with three fives. An unlimited 
         * number of ones and zeros are allowed in between.
         */

        /*
         * Character Classes (Square Brackets)
         * A character class can be used to specify a set of characters in a compact way. Characters are 
         * enclosed in square brackets, and a range is indicated with a dash. 
         * For example, [145] means (1|4|5) and [2-36-9] means (2|3|6|7|8|9). Similarly, the entry [a-c]* defines a regular expression that requires the string to contain only a, b and c
         */
    }
}
