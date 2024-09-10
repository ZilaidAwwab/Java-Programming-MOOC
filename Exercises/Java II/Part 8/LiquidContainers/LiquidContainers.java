import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container(0);
        Container container2 = new Container(0);

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);
            } else if (command.equals("move")) {
                if (container1.getAmount() >= amount) {
                    container1.remove(amount);
                    container2.add(amount);
                } else if (container1.getAmount() < amount) {
                    container2.add(container1.getAmount());
                    container1.remove(amount);
                }
            } else if (command.equals("remove")) {
                container2.remove(amount);
            }
            System.out.println("");
        }
        scan.close();
    }
}
