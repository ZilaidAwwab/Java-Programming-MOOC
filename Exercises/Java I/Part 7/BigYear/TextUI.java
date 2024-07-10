import java.util.Scanner;

public class TextUI {
  private Scanner scanner;
  private BirdDatabase database;

  public TextUI(Scanner scanner, BirdDatabase database) {
    this.scanner = scanner;
    this.database = database;
  }

  public void start() {

    boolean looping = true;

    try {

      while (looping) {
        System.out.print("?");
        String command = scanner.nextLine();
  
        switch (command) {
          case "Quit":
            looping = false;
            break;
          
          case "Add":
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Name in Latin: ");
            String nameInLatin = scanner.nextLine();
            this.database.addBird(new Bird(name, nameInLatin));
            break;
          
          case "Observation":
            System.out.println("Bird?: ");
            String nameForObservation = scanner.nextLine();
            this.database.addObervationForABird(nameForObservation);
            break;
          
          case "All":
            this.database.printAll();
            break;
          
          case "One":
            System.out.print("Bird? ");
            String searchedFor = scanner.nextLine();
            this.database.oneBird(searchedFor);
            break;
          
          default:
            System.out.println("Unknown command");
        }
      }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
  }
}
