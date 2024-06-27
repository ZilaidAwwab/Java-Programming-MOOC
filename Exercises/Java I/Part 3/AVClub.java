import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inpuString = scanner.nextLine();
            if (inpuString.equals("")) {
                break;
            } else {
                String[] splittedInput = inpuString.split(" ");
                for (String items: splittedInput) {
                    if (items.contains("av")) {
                        System.out.println(items);
                    }
                    continue;
                }
            }
        }
        scanner.close();
    }
}
