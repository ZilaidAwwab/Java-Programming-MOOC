package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean sensor = false;

    @Override
    public boolean isOn() {
        return this.sensor;
    }

    @Override
    public void setOn() {
        if(!this.sensor) {
            this.sensor = true;
        }
    }

    @Override
    public void setOff() {
        if(this.sensor) {
            this.sensor = false;
        }
    }

    @Override
    public int read() {
        if(this.sensor) {
            Random random = new Random();
            int randomNumber = random.nextInt(61) - 30;
            return randomNumber;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
