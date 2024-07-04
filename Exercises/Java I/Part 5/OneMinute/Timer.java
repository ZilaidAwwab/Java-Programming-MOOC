public class Timer {
  private ClockHand milliSecond;
  private ClockHand second;

  public Timer() {
    this.milliSecond = new ClockHand(100);
    this.second = new ClockHand(60);
  }

  public void advance() {
    this.milliSecond.advance();;

    if (this.milliSecond.value() == 0) {
      second.advance();
    }
  }

  public String toString() {
    return this.second + ":" + this.milliSecond;
  }
}
