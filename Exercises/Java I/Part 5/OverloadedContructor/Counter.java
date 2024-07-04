public class Counter {
  private int value;

  public Counter(int startValue) {
    this.value = startValue;
  }

  public Counter() {
    this (0);
  }

  public int value() {
    return this.value;
  }

  public void increase() {
    this.value += 1;
  }
  
  public void increase(int increaseBy) {
    if (increaseBy < 0) {
      return;
    } else {
      this.value += increaseBy;
    }
  }

  public void decrease() {
    this.value -= 1;
  }
  
  public void decrease(int decreaseBy) {
    if (decreaseBy < 0) {
      return;
    } else {
      this.value -= decreaseBy;
    }
  }

  public int getValue() {
    return this.value;
  }

  public String toString() {
    return "" + this.value;
  }
}
