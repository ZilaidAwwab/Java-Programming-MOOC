public class Card {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEART);
        System.out.println(first);

        if(first.getSuit() == Suit.SPADE) {
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }

        System.out.println(Suit.DIAMOND.ordinal());
        System.out.println(Suit.HEART.ordinal());
    }
}

/*
 * Each enum field gets a unique number code, and they can be compared using the 
 * equals sign. Just as other classes in Java, these values also inherit the Object 
 * class and its equals method. The equals method compares this numeric identifier 
 * in enum types too.


 * The numeric identifier of an enum field value can be found with ordinal(). The 
 * method actually returns an order number - if the enum value is presented first, 
 * its order number is 0. If its second, the order number is 1, and so on.
 */
