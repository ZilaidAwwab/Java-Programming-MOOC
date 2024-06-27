import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int birthYear = 0;
        int totalNoOfUsers = 0;
        double averageBirthYear = 0;
        int sumOfBirthYear = 0;

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }

            String[] splitInput = userInput.split(",");
            String userName = splitInput[0];
            if (userName.length() > name.length()) {
                name = userName;
            }

            birthYear = Integer.valueOf(splitInput[1]);
            totalNoOfUsers++;
            sumOfBirthYear += birthYear;
        }

        averageBirthYear = (double) sumOfBirthYear / totalNoOfUsers;
        System.out.println("Longest Name: " + name);
        System.out.println("Average of the birth years: " + averageBirthYear);

        scanner.close();
    }
}
