import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inputText = scanner.nextLine();
            if (inputText.equals("")) {
                break;
            } else {
                String[] modifiedText = inputText.split(" ");
                for (String text: modifiedText) {
                    System.out.println(text);
                }
            }
        }

        scanner.close();
    }
}
