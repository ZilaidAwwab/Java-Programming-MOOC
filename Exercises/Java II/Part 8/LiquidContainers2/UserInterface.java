import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private Container container1;
  private Container container2;

  public UserInterface(Scanner scanner, Container container1, Container container2) {
    this.scanner = scanner;
    this.container1 = container1;
    this.container2 = container2;
  }

  public void start() {
    while (true) {
      System.out.println("First: " + container1);
      System.out.println("Second: " + container2);
    
      String input = scanner.nextLine();
      if (input.equals("quit")) {
          break;
      }
    
      String[] parts = input.split(" ");
      String command = parts[0];
      int amount = Integer.valueOf(parts[1]);
    
      if (command.equals("add")) {
          container1.add(amount);
      } else if (command.equals("move")) {
          if (container1.contains() >= amount) {
              container1.remove(amount);
              container2.add(amount);
          } else if (container1.contains() < amount) {
              container2.add(container1.contains());
              container1.remove(amount);
          }
      } else if (command.equals("remove")) {
          container2.remove(amount);
      }
      System.out.println("");
    }
  }
}
