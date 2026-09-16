package day5.shapeArea;

public abstract class Shape {

    protected static void validateDimension(double dimension) {

        if (!Double.isFinite(dimension) || dimension <= 0) {
            throw new IllegalArgumentException("Dimension must be finite and positive");
        }
    }

    public abstract double calculateArea();


    public void display() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Area: " + this.calculateArea());
    }
}
