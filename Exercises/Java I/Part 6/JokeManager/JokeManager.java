import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
  private ArrayList<String> jokes;

  public JokeManager() {
    this.jokes = new ArrayList<>();
  }

  public void addJoke(String joke) {
    this.jokes.add(joke);
  }

  public String drawJoke() {
    String randomJoke = "";
    if (jokes.isEmpty()) {
      randomJoke = "Jokes are in short supply.";

    } else {
      Random rand = new Random();
      int index = rand.nextInt(jokes.size());
      randomJoke = jokes.get(index);
    }
    return randomJoke;
  }

  public void printJokes() {
    System.out.println("Printing the jokes.");
    for (String joke : jokes) {
      System.out.println(joke);
    }
  }
}
