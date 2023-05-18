package PracticeHandlingExceptions.application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    @Override
    public boolean isOn(){
        return false;
    }

    @Override
    public void setOn(){

    }

    @Override
    public void setOff(){

    }

    @Override
    public int read() {
        int temp = new Random().nextInt((61)-30);
        return temp;
    }

    public static void main(String[] args) throws Exception {
        TemperatureSensor newSensor = new TemperatureSensor();

        newSensor.setOff();

        if (newSensor.isOn() == false) {
            throw new IllegalStateException("Sensor needs to be turned on");

        }
        while(newSensor.isOn()){
            System.out.println(newSensor.read());

        }


    }
}
