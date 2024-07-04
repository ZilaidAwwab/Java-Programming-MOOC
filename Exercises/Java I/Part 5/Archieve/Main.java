import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>(); 

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            Item item = new Item(identifier, name);

            if (list.contains(item)) {
                System.out.println("Already on list");
            } else {
                list.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item e: list) {
            System.out.println(e);
        }

        scanner.close();
    }
}
