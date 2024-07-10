public class Container {
  private int contain;

  public Container() {
    this.contain = 0;
  }

  public int contains() {
    return this.contain;
  }

  public void add(int amount) {
    if (amount > 0 && amount + contain <= 100) {
      contain += amount;
    } else if (amount > 0 && amount + contain > 100) {
      contain = 100;
    }
  }

  public void remove(int amount) {
    if (amount > 0 && contain - amount >= 0) {
      contain -= amount;
    } else if (amount > 0 && contain - amount < 0) {
      contain = 0;
    }
  }

  @Override
  public String toString() {
    return this.contain + "/100";
  }
}
