public class Money {

    // The final here says that the values of these object variables cannot be modified after they have been set in the constructor. The objects of Money class are unchangeable so immutable — if we want to e.g. increase the amount of money, we must create a new object to represent that new amount of money.
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = euros + addition.euros();
        int newCents = cents + addition.cents();

        if (newCents > 99) {
            newCents -= 100;
            newEuros += 1;
        }

        Money money = new Money(newEuros, newCents);
        return money;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newEuros = euros - decreaser.euros();
        int newCents = cents - decreaser.cents();

        if (newCents < 0) {
            newCents += 100;
            newEuros -= 1;
        }

        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
