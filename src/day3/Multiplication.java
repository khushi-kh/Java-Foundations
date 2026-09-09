package day3;

public class Multiplication {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        System.out.println(multiply(2,3));
        System.out.println(multiply(3.5,4.5));
        System.out.println(multiply(3,4,5));
    }
}
