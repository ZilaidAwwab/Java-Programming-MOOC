import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        BirdDatabase database = new BirdDatabase();
        TextUI text = new TextUI(scan, database);
        text.start();

        scan.close();
    }
}
