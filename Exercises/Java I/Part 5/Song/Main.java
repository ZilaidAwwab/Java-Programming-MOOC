public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song jackoline = new Song("The lone man", "Jack Loveline", 201);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals(jackoline)) {
            System.out.println("Strange things are afoot.");
        }
    }
}
