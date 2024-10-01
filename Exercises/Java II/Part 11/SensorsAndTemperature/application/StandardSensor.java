package application;

public class StandardSensor implements Sensor {

    private int digit;

    public StandardSensor(int digit) {
        this.digit = digit;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        return this.digit;
    }
}
