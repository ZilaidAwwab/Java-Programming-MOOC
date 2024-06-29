import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine().toLowerCase();

        int games = 0;
        int won = 0;
        int lost = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                if (row.contains(team)) {
                    games++;
                    String[] part = row.split(",");
                    
                    String firstTeam = part[0];
                    String secondTeam = part[1];
                    
                    int firstScore = Integer.valueOf(part[2]);
                    int secondScore = Integer.valueOf(part[3]);
                    
                    if ((firstTeam.equals(team) && firstScore > secondScore) || (secondTeam.equals(team) && secondScore > firstScore)) {
                        won++;
                    } else if ((firstTeam.equals(team) && firstScore < secondScore) || (secondTeam.equals(team) && secondScore < firstScore)) {
                        lost++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + won);
            System.out.println("Losses: " + lost);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}
