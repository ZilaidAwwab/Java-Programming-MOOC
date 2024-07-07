import java.util.Scanner;

public class TextUI {
  private Scanner scanner;
  private SimpleDictionary dict;

  public TextUI(Scanner scanner, SimpleDictionary dict) {
    this.dict = dict;
    this.scanner = scanner;
  }


  public void start() {

    while (true) {
      System.out.println("Command: ");
      String word = scanner.nextLine();

      if (word.equals("end")) {
        System.out.println("Bye bye!");
        break;

      } else if (word.equals("add")) {
        System.out.print("Word: ");
        String wordString = scanner.nextLine();

        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        dict.add(wordString, translation);

      } else if (word.equals("search")) {
        System.out.print("To be translated: ");
        String searchedFor = scanner.nextLine();

        if (dict.translate(searchedFor) == null) {
          System.out.println("Word " + searchedFor + " was not found");
        } else {
          System.out.println("Translation: " + dict.translate(searchedFor));
        }

      }else {
        System.out.println("Unknown command");
      }

    }
  }
}
