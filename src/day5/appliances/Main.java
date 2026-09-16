package day5.appliances;

public class Main {

    public static void main(String[] args) {

        Appliance fan = new Fan();
        Appliance washingMachine = new WashingMachine();

        fan.turnOn();
        fan.turnOff();

        System.out.println();

        washingMachine.turnOn();
        washingMachine.turnOff();
    }
}
