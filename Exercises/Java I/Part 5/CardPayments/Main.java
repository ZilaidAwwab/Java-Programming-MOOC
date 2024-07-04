public class Main {

    public static void main(String[] args) {
        // Payment card process testing
        
        // PaymentCard petesCard = new PaymentCard(10);
        // System.out.println("money " + petesCard.balance());
        // boolean wasSuccessful = petesCard.takeMoney(8);
        // System.out.println("successfully withdrew: " + wasSuccessful);
        // System.out.println("money " + petesCard.balance());
        
        // wasSuccessful = petesCard.takeMoney(4);
        // System.out.println("successfully withdrew: " + wasSuccessful);
        // System.out.println("money " + petesCard.balance());
        
        // Payment terminal process testing
        // PaymentTerminal unicafeExactum = new PaymentTerminal();

        // double change = unicafeExactum.eatAffordably(10);
        // System.out.println("remaining change " + change);

        // change = unicafeExactum.eatAffordably(5);
        // System.out.println("remaining change " + change);
        
        // change = unicafeExactum.eatHeartily(4.30);
        // System.out.println("remaining change " + change);

        // System.out.println(unicafeExactum);

        // All classes combined
        // PaymentTerminal unicafeExactum = new PaymentTerminal();

        // double change = unicafeExactum.eatAffordably(10);
        // System.out.println("remaining change: " + change);

        // PaymentCard annesCard = new PaymentCard(7);

        // boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);
        // wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // System.out.println(unicafeExactum);

        // Final test
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
