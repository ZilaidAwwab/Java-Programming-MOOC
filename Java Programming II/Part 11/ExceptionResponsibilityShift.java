/* 
 * The code below reads the file given to it as a parameter line by line. Reading a 
 * file can throw an exception — for example, the file might not exist or the 
 * program does not have read rights to the file. This kind of exception has to be 
 * handled. We handle the exception by wrapping the code into a try-catch block. In 
 * this example we do not really care about the exception, but we do print a message 
 * to the user about it.
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExceptionResponsibilityShift {

    // Here we throw the exception out of method
    public List<String> readLines(String fileName) {

        List<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(line -> lines.add(line));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lines;
    }

    /*
     * In the above method we use the try catch blocks to catch the exception in the
     * block, but here we are shifting the responsibility of handling and throwing
     * the exception out of method to the mathod itself, so we can use either
     */
    public List<String> readLine(String fileName) throws Exception {

        List<String> lines = new ArrayList<>();
        Files.lines(Paths.get("file.txt")).forEach(line -> lines.add(line));
        return lines;
    }
}
