public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comapredPerson = (Person) compared;

        if (this.name.equals(comapredPerson.name) &&
        this.birthday.equals(comapredPerson.birthday) &&
        this.height == comapredPerson.height &&
        this.weight == comapredPerson.weight) {
            return true;
        }

        return false;
    }
}
