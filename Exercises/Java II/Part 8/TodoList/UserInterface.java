import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private TodoList todoList;

  public UserInterface(TodoList todoList, Scanner scanner) {
    this.scanner = scanner;
    this.todoList = todoList;
  }

  public void start() {

    boolean looping = true;

    while (looping) {
      System.out.print("Command: ");
      String command = scanner.nextLine();
      
      switch (command) {
        case "stop":
          looping = false;
          break;
        
        case "add":
          System.out.print("To add: ");
          String addedTask = scanner.nextLine();
          todoList.add(addedTask);
          break;

          case "list":
          todoList.print();
          break;
          
          case "remove":
            System.out.print("Which one is removed? ");
            int removeTask = Integer.valueOf(scanner.nextLine());
            todoList.remove(removeTask);
            break;

          default:
            System.out.println("Unknown command");
      }
    }
  }
}
