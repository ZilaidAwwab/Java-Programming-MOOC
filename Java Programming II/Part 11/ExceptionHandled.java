/* We can handle the exception in such a way that till the user have'nt entered
 * the number, we will keep prompting them for the correct input
 */

import java.util.Scanner;

public class ExceptionHandled {
    public int readNumber(Scanner reader) {
        while (true) {
            System.out.println("Give a number");

            try {
                int readNumber = Integer.parseInt(reader.nextLine());
                return readNumber;
            } catch(Exception e) {
                System.out.println("User input was not a number");
            }
        }
    }
}
