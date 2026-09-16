package day5.shapeArea;

public class Rectangle extends Shape{

    private final double length;
    private final double width;


    public Rectangle(double length, double width) {

        validateDimension(length);
        validateDimension(width);

        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length * width;
    }


    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }
}
