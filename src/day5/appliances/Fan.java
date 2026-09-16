package day5.appliances;

public class Fan implements Appliance {

    @Override
    public void turnOn() {
        System.out.println("Fan is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off.");
    }
}
