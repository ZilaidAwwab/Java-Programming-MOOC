import java.util.Scanner;

public class TextInterface {

    private Scanner scanner;
    private RecipeBook recipeList;

    public TextInterface(Scanner scanner, RecipeBook recipes) {
        this.scanner = scanner;
        this.recipeList = recipes;
    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("Commands:" + "\n"
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (shouldLoop) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":

                    shouldLoop = false;
                    break;
                case "list":
                    System.out.println("Recipes:");
                    recipeList.printRecipeBook();

                    break;
                case "find name":
                    System.out.print("Search word: ");
                    String searchWord = scanner.nextLine();

                    recipeList.printByName(searchWord);

                    break;
                case "find cooking time":
                    System.out.print("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByTime(searchWord);

                    break;
                case "find ingredient":
                    System.out.print("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByIngredient(searchWord);

                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
