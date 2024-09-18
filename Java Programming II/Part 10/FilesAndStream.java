import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesAndStream {
    public static void main(String[] args) {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
 * Streams are also very handy in handling files. The file is read in stream form using Java's ready-made Files class. The lines method in the files class allows you to create an input stream from a file, allowing you to process the rows one by one. The lines method gets a path as its parameter, which is created using the get method in the Paths class. The get method is provided a string describing the file path.
 */

/* When reading a file like this
Kaarlo Juho Ståhlberg; 1865
Lauri Kristian Relander; 1883
Pehr Evind Svinhufvud; 1861
Kyösti Kallio; 1873
Risto Heikki Ryti; 1889
Carl Gustaf Emil Mannerheim; 1867
Juho Kusti Paasikivi; 1870
Urho Kaleva Kekkonen; 1900
Mauno Henrik Koivisto; 1923
Martti Oiva Kalevi Ahtisaari; 1937
Tarja Kaarina Halonen; 1943
Sauli Väinämö Niinistö; 1948
 */

/*
List<Person> presidents = new ArrayList<>();
try {
    // reading the "presidents.txt" file line by line
    Files.lines(Paths.get("presidents.txt"))

        // splitting the row into parts on the ";" character
        .map(row -> row.split(";"))

        // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
        .filter(parts -> parts.length >= 2)

        // creating persons from the parts
        .map(parts -> new Person(parts[0], Integer.valueOf(parts[1])))
        
        // and finally add the persons to the list
        .forEach(person -> presidents.add(person));

} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
 */
