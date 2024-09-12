public class CD implements Packable {
    private String artist;
    private String nameOfCD;
    private int yearPublished;
    private double weight;

    public CD(String artist, String nameOfCD, int yearPublished) {
        super();
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.yearPublished = yearPublished;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.nameOfCD + " (" + this.yearPublished + ")";
    }
}
