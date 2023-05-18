package PracticeHandlingExceptions.application;

public class StandardSensor implements Sensor {
    int number;

    public StandardSensor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff(){

    }

    public int read() {
        return getNumber();
    }

    public static void main(String[] args) throws Exception {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }

}


