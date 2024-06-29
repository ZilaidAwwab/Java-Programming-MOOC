public class Statistics {
  private int count;
  private int sum;

  public Statistics() {}

  public void addNumber(int number) {
    this.sum += number;
    this.count += 1;
  }

  public int getCount() {
    return this.count;
  }

  public int sum() {
    return this.sum;
  }

  public double average() {
    if (sum == 0) {
      return 0;
    }
    return (double) this.sum / this.count;
  }
}
