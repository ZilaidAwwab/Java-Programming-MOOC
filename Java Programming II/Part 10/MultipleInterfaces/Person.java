package MultipleInterfaces;

public class Person implements Identifiable, Comparable<Person> {
    private String name;
    private String socialSecurityNumber;

    public Person(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    /*
     * When we are implementing two @interfaces, we have to make sure that we override the methods coming from both interfaces as we are doing here
     */

    @Override
    public String getId() {
        return getSocialSecurityNumber();
    }

    @Override
    public int compareTo(Person another) {
        return this.getId().compareTo(another.getId());
    }
}
