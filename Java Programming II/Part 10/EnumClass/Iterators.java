import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    private List<Card> cards;
    
    public Iterators() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        // this.cards.stream().forEach(card -> System.out.println(card));

        /* Using the iterator from the Collection interface */
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            /*
             * This could also be written as
             * Card nextInLine = iterator.next();
             * System.out.println(nextInLine);
             */
        }
    }

    /*
     * Let's now consider a use case for an iterator. We'll first approach the issue 
     * problematically to provide motivation for the coming solution. We attempt to 
     * create a method that removes cards from a given stream with a value lower 
     * than the given value.
     public void removeWorst(int value) {
         this.cards.stream().forEach(card -> {
             if (card.getValue() < value) {
                 cards.remove(card);
             }
         });
     }

     * This results in an error
     */

     /*
      * The reason for this error lies in the fact that when a list is iterated over 
      * using the forEach method, it's assumed that the list is not modified during 
      * the traversal. Modifying the list (in this case deleting elements) causes an * error - we can think of the forEach method as getting "confused" here.

      * If you want to remove some of the objects from the list during a traversal, * you can do so using an iterator. Calling the remove method of the iterator 
      * object neatly removes form the list the item returned by the iterator with *the previous next call. Here's a working example of the version of the method:
      */
      
    public void removeWorst(int value) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                // removing from the list the element returned by the previous next-method call
                iterator.remove();
            }
        }
    }
}
