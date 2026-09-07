package day1;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");

        int number = sc.nextInt();

        int sumOfDigits = 0;

        while (number != 0) {

            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println("Sum of Digits of the number is " + sumOfDigits);
        sc.close();
    }
}
