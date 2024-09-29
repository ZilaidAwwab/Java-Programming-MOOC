/* The code below reads all lines from "file.txt" and adds them to an ArrayList
* Reading a file might throw an exception, so it requires a try-catch block. 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionAndResources {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        // create a scanner object for reading files
        try (Scanner reader = new Scanner(new File("file.txt"))) {
            // read all the lines from a file
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/* The try-with-resources approach is useful for handling resources, because the 
* program closes the used resources automatically. Now references to files can 
* "disappear", because we do not need them anymore. If the resources are not closed, * the operating system sees them as being in use until the program is closed. 
*/
