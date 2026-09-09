package day3;

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNumber(int n) {

        int reversedNumber = 0;

        while(n!=0) {

            int digit = n % 10;

            reversedNumber = (reversedNumber*10) + digit;

            n /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        System.out.printf("%d → %d", num, reverseNumber(num));
    }
}
