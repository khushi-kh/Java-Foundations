package day5;

public class Rectangle {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length+width);
    }

    public void displayDetails() {
        System.out.printf("Length: %.2f, Width: %.2f %n", length, width);
        System.out.printf("Perimeter: %.2f %n", calculatePerimeter());
        System.out.printf("Area: %.2f  %n", calculateArea());
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.5, 9);
        Rectangle rect2 = new Rectangle(4, 3);

        rect1.displayDetails();
        rect2.displayDetails();
    }
}
