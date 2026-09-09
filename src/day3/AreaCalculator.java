package day3;
import java.util.Scanner;

public class AreaCalculator {

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        AreaCalculator obj = new AreaCalculator();

        System.out.println("Area Calculator");

        System.out.println("Select\n1.Square\n2.Rectangle\n3.Circle");

        int choice = sc.nextInt();

        switch (choice) {

            case 1 -> {
                System.out.print("Enter side: ");

                int side = sc.nextInt();

                System.out.println("Area = " + obj.area(side));
            }
            case 2 -> {
                System.out.print("Enter length: ");

                int length = sc.nextInt();

                System.out.print("Enter breadth: ");

                int breadth = sc.nextInt();

                System.out.println("Area = " + obj.area(length, breadth));
            }
            case 3 -> {
                System.out.print("Enter radius: ");

                double radius = sc.nextDouble();

                System.out.println("Area = " + obj.area(radius));
            }
            default -> System.out.println("Invalid Choice. Try again");
        }
        sc.close();
    }
}
