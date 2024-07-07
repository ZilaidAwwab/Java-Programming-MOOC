import java.util.ArrayList;

public class Room {
  ArrayList<Person> list;

  public Room() {
    this.list = new ArrayList<>();
  }

  public void add(Person person) {
    this.list.add(person);
  }

  public boolean isEmpty() {
    if (this.list.isEmpty()) {
      return true;
    }
    return false;
  }

  public ArrayList<Person> getPersons() {
    return this.list;
  }

  public Person shortest() {
    if (this.list.isEmpty()) {
      return null;
    }
    
    Person shortestPerson = this.list.get(0);

    for (Person per: list) {
      if (shortestPerson.getHeight() > per.getHeight()) {
        shortestPerson = per;
      }
    }
    return shortestPerson;
  }

  public Person take() {
    if (this.list.isEmpty()) {
      return null;
    }

    Person shortestOne = shortest();
    this.list.remove(shortestOne);

    return shortestOne;
  }
}
