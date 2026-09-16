package day5.appliances;

public class WashingMachine implements Appliance {

    @Override
    public void turnOn() {
        System.out.println("Washing machine is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine is turned off.");
    }
}
