package day5.shapeArea;

public class Triangle extends Shape{

    private final double base;
    private final double height;


    public Triangle(double base, double height) {

        validateDimension(base);
        validateDimension(height);

        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }


    public double getBase() {
        return base;
    }


    public double getHeight() {
        return height;
    }
}
