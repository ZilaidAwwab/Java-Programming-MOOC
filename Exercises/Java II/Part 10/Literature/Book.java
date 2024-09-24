public class Book {
    private String name;
    private int recAge;

    public Book(String name, int recAge) {
        this.name = name;
        this.recAge = recAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecAge() {
        return recAge;
    }

    public void setRecAge(int recAge) {
        this.recAge = recAge;
    }

    public String toString() {
        return name + " (recommended for " + recAge + " year-olds or older)";
    }
}
