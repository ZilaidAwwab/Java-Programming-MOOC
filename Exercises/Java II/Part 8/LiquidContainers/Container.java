public class Container {
  private int amount;

  public Container(int amount) {
    this.amount = amount;
  }

  public void add(int amount) {
    if (amount > 0) {
      if (this.amount + amount <= 100) {
        this.amount += amount;
      } else if (this.amount + amount > 100) {
        this.amount = 100;
      }
    }
  }

  public void remove(int amount) {
    if (amount > 0) {
      if (this.amount - amount >= 0) {
        this.amount -= amount;
      } else if (this.amount - amount < 0) {
        this.amount = 0;
      }
    }
  }

  public int getAmount() {
    return this.amount;
  }

  public String toString() {
    return "" + this.amount;
  }
}
