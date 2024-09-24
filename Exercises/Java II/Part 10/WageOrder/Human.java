public class Human implements Comparable<Human> {
    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(Human human) {
        // here we wanted from largest to smallest
        return human.getWage() - this.getWage();
        
        // if we were required from smallest to largest
        // return this.getWage() - human.getWage();
    }

    @Override
    public String toString() {
        return name + " " + wage;
    }
}
