package day5.vehicleRental;

public class Vehicle {

    private final String brand;
    private int rentalPrice;

    Vehicle(String brand, int rentalPrice) {

        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand name can't be blank");
        }

        if (rentalPrice <= 0) {
            throw new IllegalArgumentException("Rental Price must be positive");
        }

        this.brand = brand;
        this.rentalPrice = rentalPrice;
    }


    public String getBrand() {
        return brand;
    }


    public int getRentalPrice() {
        return rentalPrice;
    }


    public void updateRentalPrice(int rentalPrice) {
        if (rentalPrice <= 0) {
            throw new IllegalArgumentException("Rental Price must be positive");
        }

        this.rentalPrice = rentalPrice;
    }


    public int calculateRentalCost(int days) {

        if (days <= 0) {
            throw new IllegalArgumentException("Days must be positive");
        }
        return Math.multiplyExact(this.rentalPrice, days);
    }

}
