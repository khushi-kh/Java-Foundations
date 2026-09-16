package day5.vehicleRental;

public class Main {

    public static void main(String[] args) {

        Car c = new Car("BMW", 100000);
        Bike b = new Bike("Royal Enfield", 50000);

        System.out.printf("Rental cost for %s for 5 days: %d %n", c.getBrand(), c.calculateRentalCost(5));
        System.out.printf("Rental cost for %s for 5 days: %d %n", b.getBrand(), b.calculateRentalCost(5));

        b.updateRentalPrice(52000);
        System.out.printf("Updated rental price for %s: %d %n", b.getBrand(), b.getRentalPrice());
    }
}
