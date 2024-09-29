import java.io.PrintWriter;

public class WritingOnFile {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter("file.txt");

        //writes the string "Hello file!" and line change to the file
        writer.println("Hello file!");  
        writer.println("More text");

        // writes the string "And a little extra" to the file without a line change
        writer.print("And a little extra"); 

        //closes the file and ensures that the written text is saved to the file
        writer.close(); 
    }
}
