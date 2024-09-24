import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public void print() {
        Iterator<Card> iterator = hand.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public int compareTo(Hand that) {
        int thisValue = this.hand.stream().map(card -> card.getValue()).reduce(0, (a, b) -> a+b);
        int thatValue = that.hand.stream().map(card -> card.getValue()).reduce(0, (a, b) -> a+b);

        return thisValue - thatValue;

    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
