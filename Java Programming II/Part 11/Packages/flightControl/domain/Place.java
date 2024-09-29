package flightControl.domain;

public class Place {
    private String id;

    public Place(String ID) {
        this.id = ID;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
