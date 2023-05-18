package PracticeHandlingExceptions.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> tempReadings;

    public AverageSensor(){
        sensors = new ArrayList<>();
        tempReadings = new ArrayList<>();
    }


    @Override
    public boolean isOn() {
        for (int i = 0;  i < sensors.size(); i++){
            if (!sensors.get(i).isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (int i = 0;  i < sensors.size(); i++){
            sensors.get(i).setOn();
        }
    }

    @Override
    public void setOff() {
        for (int i = 0;  i < sensors.size(); i++){
            if (sensors.get(i).isOn()){
                sensors.get(i).setOff();
            }
        }
    }

    @Override
    public int read() {
        int temp = 0;

        if (sensors.isEmpty() || isOn()) {
            throw new IllegalStateException("There are no sensors or one of your sensors is off.");
        }
        for (int i = 0;  i < sensors.size(); i++){
            temp = (sensors.get(i).read() + temp);
            }
        return temp/sensors.size();
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings(){
        for (int i = 0;  i < sensors.size(); i++){
           int tempReading = sensors.get(i).read();
           tempReadings.add(tempReading);
           System.out.println(tempReadings);
        } return tempReadings;
    }

    public static void main(String[] args) {
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }
}
