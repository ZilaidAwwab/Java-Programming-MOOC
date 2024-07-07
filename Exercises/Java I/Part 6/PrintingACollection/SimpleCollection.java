import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOut = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return printOut + " is empty.";
        }

        String element = "";
        for (String collection: elements) {
            if (elements.size() <= 1) {
                element += collection;
            } else {
                element += collection + "\n";
            }
        }

        if (elements.size() == 1) {
            return printOut + " has " + elements.size() + " element:\n" + element;
        }

        return printOut + " has " + elements.size() + " elements:\n" + element;
    }
}
