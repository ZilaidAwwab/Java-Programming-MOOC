package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> avgList;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.avgList = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean isOn = false;

        for(Sensor e: sensors) {
            if(e.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        for(Sensor e: sensors) {
            e.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor e: sensors) {
            e.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        if(isOn() && !sensors.isEmpty()) {
            for(Sensor e: sensors) {
                sum += e.read();
            }

            int average = sum / sensors.size();
            avgList.add(average);
            return average;
        } else {
            throw new IllegalStateException();
        }
    }

    public List<Integer> readings() {
        return avgList;
    }    
}
