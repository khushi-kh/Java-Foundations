package day3;
import java.util.Scanner;

public class SumOfDigits {

    static int sumOfDigits(int number) {

        int total = 0;

        while (number != 0) {

            int digit = number % 10;
            total += digit;
            number /= 10;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        System.out.printf("The sum of digits of %d is %d", num, sumOfDigits(num));
    }
}
