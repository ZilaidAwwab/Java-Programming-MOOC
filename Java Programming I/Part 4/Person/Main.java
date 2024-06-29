import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Person ada = new Person("Ada");
    Person antti = new Person("Antti");

    int i = 0;
    while (i < 30) {
      ada.growOlder();
      i++;
    }

    antti.growOlder();

    System.out.println("");
    
    if (ada.isOfLegalAge()) {
      System.out.println(ada.getName() + " is of legal age.");
    } else {
      System.out.println(ada.getName() + " is underage.");
    }

    if (antti.isOfLegalAge()) {
      System.out.println(antti.getName() + " is of legal age.");
    } else {
      System.out.println(antti.getName() + " is underage.");
    }

    // Usage of toString method
    System.out.println(ada); // this is same as (ada.toString();)
    System.out.println(antti);

    // Utilizing the setter and getter methods (that has parameters as well)
    ada.setHeight(180);
    ada.setWeight(86);

    antti.setHeight(175);
    antti.setWeight(65);

    System.out.println(ada.getName() + "'s BMI is " + ada.bodyMassIndex());
    System.out.println(antti.getName() + "'s BMI is " + antti.bodyMassIndex());



    // Creating list of objects (We can also take input for creating person objects)
    ArrayList<Person> persons = new ArrayList<>();

    persons.add(new Person("Mattews"));
    persons.add(new Person("Martin"));
    persons.add(new Person("John"));

    // Printing the list
    for (Person person: persons) {
      System.out.println(person);
    }
  }
}
