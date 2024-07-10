import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "\n" + "Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int operation = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(operation);
            } else if (command.equals("remove")) {
                second.remove(operation);
            } else if (command.equals("move")) {
                if (first.contains() >= operation) {
                    first.remove(operation);
                    second.add(operation);
                } else if (first.contains() < operation) {
                    second.add(first.contains());
                    first.remove(first.contains());
                }
            }

        }
        scan.close();
    }
}
