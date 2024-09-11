import java.util.Random;

public class Factory {
    public Factory() {
        /* There's no need to write the empty constructor without params
         * if the class don't have contructors, then Java automatically
         * creates by default an empty constructor without params
         */
    }

    public Packable produceNew() {
        /* The random-object  used here can be used to draw random numbers */
        Random ticket = new Random();

        /* Draw a number that ranges from [0, 4]. (0, 1, 2, 3) */
        int number = ticket.nextInt(4);

        if (number == 0) {
            return new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        } else if (number == 1) {
            return new CD("Wigwam", "Nuclear Nightclub", 1975);
        } else if (number == 2) {
            return new Book("Robert Martin", "Clean Code", 1);
        } else if (number == 3) {
            return new Book("Robert Martin", "Clean Code", 1);
        } else {
            return new ChocolateBar();
        }
    }
}
