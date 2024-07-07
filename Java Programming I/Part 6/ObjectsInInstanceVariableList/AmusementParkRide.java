import java.util.ArrayList;

public class AmusementParkRide {
  private String name;
  private int minimumHeight;
  private int visitors;
  private ArrayList<Person> riding;

  public AmusementParkRide(String name, int minimumHeight) {
    this.name = name;
    this.minimumHeight = minimumHeight;
    this.visitors = 0;
    this.riding = new ArrayList<>();
  }
  
  public boolean isAllowedOn(Person person) {
    if (person.getHeight() < this.minimumHeight) {
      return false;
    }

    this.visitors++;
    this.riding.add(person);
    return true;
  }

  // *** Retrieving a specific object from a list
  public Person getTallest() {
    // returning a null if there's no one on the ride
    if (this.riding.isEmpty()) {
      return null;
    }

    // creating an object reference for the object to be returned, its first value is the first value of the list
    Person returnObject = this.riding.get(0);

    // iterating the list
    for (Person per: riding) {
      if (returnObject.getHeight() < per.getHeight()) {
        returnObject = per;
      }
    }

    return returnObject;
  }

  // *** Calculating a sum from objects on a list
  public double averageHeightOfPeopleOnRide() {
    if (riding.isEmpty()) {
      return -1;
    }

    int sumOfHeights = 0;
    for (Person per: riding) {
      sumOfHeights += per.getHeight();
    }

    return 1.0 * sumOfHeights / riding.size();
  }

  // *** Clearing an object list
  public void removeEveryoneOnRide() {
    this.riding.clear();
  }
  
  public String toString() {

    
    String printOut =  this.name + ", minimum height requirement: " + this.minimumHeight + ", visitors: " + this.visitors;
    
    if (riding.isEmpty()) {
      return printOut + " no one is on the ride.";
    }
    
    // *** Printing an object from the list

    // Adding the functionality of adding the name of the persons who are riding
    String onTheRide = "";
    for (Person person: riding) {
      onTheRide += person.getName();
    }

    return printOut + " riding: " + onTheRide;
  }
}
