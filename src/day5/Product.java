package day5;

public class Product {

    private double price;
    private int quantity;


    public Product(double price, int quantity) {

        if (!isValidPrice(price) || quantity < 0) {
            throw new IllegalArgumentException("Values must be non-negative and finite");
        }

        this.price = price;
        this.quantity = quantity;
    }


    public int updateStock(int addedQuantity) {

        if (addedQuantity < 0) {
            throw new IllegalArgumentException("Quantity must be non-negative");
        }

        this.quantity += addedQuantity;
        return this.quantity;
    }


    public double calculateTotalValue() {

        return this.quantity * this.price;
    }


    public boolean isValidPrice(double input) {

        return input >= 0 && Double.isFinite(input);
    }


    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }


    public static void main(String[] args) {

        try {
            Product obj = new Product(120.5, 40);

            System.out.println("Price: " + obj.getPrice() + " Quantity: " + obj.getQuantity());

            System.out.println(obj.updateStock(60));

            System.out.println(obj.calculateTotalValue());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
    }
}
