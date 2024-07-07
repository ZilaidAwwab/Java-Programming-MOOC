public class Main {

    public static void main(String[] args) {
        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's stone", 2);
        Gift chocolates = new Gift("Kit Kats", 4);

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(chocolates);
        // System.out.println(gifts);
        System.out.println(gifts.totalWeight());
    }
}
