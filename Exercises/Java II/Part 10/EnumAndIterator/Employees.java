import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public void add(List<Person> peopleToAdd) {
        for(Person person: peopleToAdd) {
            this.persons.add(person);
        }
    }

    public void fire(Education education) {
        Iterator<Person> personal = persons.iterator();

        while (personal.hasNext()) {
            if (personal.next().getEducation() == education) {
                personal.remove();
            }
        }
    }

    /* Print was required to use iterator method */
    public void print() {
        Iterator<Person> personals = this.persons.iterator();
        personals.forEachRemaining(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<Person> personals = persons.iterator();

        while (personals.hasNext()) {
            // Adding this line is crucial, otherwise we can get the error of address printing
            Person nextPerson = personals.next();
            if(nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
}
