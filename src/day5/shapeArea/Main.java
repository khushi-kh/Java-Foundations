package day5.shapeArea;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {new Circle(7), new Rectangle(3, 4.5), new Triangle(24, 10)};

        for (Shape shape : shapes) {
            shape.display();
        }
    }
}
