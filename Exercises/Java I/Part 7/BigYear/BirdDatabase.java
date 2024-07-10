import java.util.ArrayList;

public class BirdDatabase {
  private ArrayList<Bird> birds;

  public BirdDatabase() {
    this.birds = new ArrayList<>();
  }

  public void addBird(Bird bird) {
    this.birds.add(bird);
  }

  public void printAll() {
    if (this.birds.isEmpty()) {
      System.out.println("No birds in there.");
    } else {
      for (Bird bird: birds) {
        System.out.println(bird);
      }
    }
  }

  public void addObervationForABird(String name) {
    for (Bird bird: this.birds) {
      if (bird.getName().toLowerCase().contains(name.toLowerCase())) {
        bird.observe();
      } else {
        System.out.println("Not a bird");
      }
    }
  }

  public void oneBird(String searchedBird) {
    if (this.birds.isEmpty()) {
      System.out.println("Not found");
    } else {
      for (Bird bird: birds) {
        if (bird.getName().toLowerCase().contains(searchedBird.toLowerCase())) {
          System.out.println(bird);
        }
      }
    }
  }
}
