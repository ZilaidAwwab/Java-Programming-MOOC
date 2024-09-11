import java.util.Scanner;

public class PlusOperation extends Operation {
    public PlusOperation() {
        super("PlusOperation");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }
}

/*
 * Since all the classes that inherit from Operation have also the type Operation, we can create a user interface by using Operation type variables. Next we'll show the class UserInterface that contains a list of operations and a scanner. It's possible to add operations to the UI dynamically.
 */
