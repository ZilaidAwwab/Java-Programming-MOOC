import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int max = 100;


        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int operation = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                if (operation > 0 && operation + first <= 100 ) {
                    first += operation;
                } else if (operation > 0 && operation + first > 100) {
                    first = 100;
                }

            } else if (parts[0].equals("move")) {
                if (operation > 0 && first >= operation && operation + second <= 100 ) {
                    first -= operation;
                    second += operation;
                } else if (operation > 0 && first >= operation && operation + second > 100) {
                    first -= operation;
                    second = 100;
                } else if (operation > 0 && first < operation && operation + second <= 100) {
                    second += first;
                    first = 0;
                } else if (operation > 0 && first < operation && operation + second > 100) {
                    first = 0;
                    second = 100;
                }
                

            } else if (parts[0].equals("remove")) {
                if (operation > 0 && second - operation >= 0) {
                    second -= operation;
                } else if (operation > 0 && second - operation < 0) {
                    second = 0;
                }
            }
        }
        scan.close();
    }
}
