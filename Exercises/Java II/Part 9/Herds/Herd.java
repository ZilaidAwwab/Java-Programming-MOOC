import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable moveable) {
        this.herd.add(moveable);
    }

    public void move(int dx, int dy) {
        for (Movable objs: herd) {
            objs.move(dx, dy);
        }
    }

    public String toString() {
        String newString = "";
        for (Movable items: herd) {
            // Making one string with each item printing on the new line
            newString += items.toString().trim() + "\n";
        }
        return newString;
    }
}
