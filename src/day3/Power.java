package day3;
import java.util.Scanner;

public class Power {

    static int calculatePower(int base, int exponent) {

        int result = 1;

        for (int i=1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");

        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");

        int exponent = sc.nextInt();

        System.out.printf("%d^%d = %d", base, exponent, calculatePower(base, exponent));

        sc.close();
    }
}
