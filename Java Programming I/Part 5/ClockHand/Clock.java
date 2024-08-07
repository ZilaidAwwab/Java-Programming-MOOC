public class Clock {
  private ClockHand hours;
  private ClockHand minutes;
  private ClockHand seconds;

  public Clock() {
    this.hours = new ClockHand(24);
    this.minutes = new ClockHand(60);
    this.seconds = new ClockHand(60);
  }

  public void advance() {
    this.seconds.advance();
    
    if (seconds.value() == 0) {
      minutes.advance();
      
      if (minutes.value() == 0) {
        hours.advance();
      }
    }
  }

  public String toString() {
    return hours + ":" + minutes + ":" + seconds;
  }
}
