package day1;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        int temp = number;

        int reversedNumber = 0;

        while (temp != 0) {

            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        if (number == reversedNumber) {

            System.out.println("Palindrome");
        }
        else {

            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}

// TODO: Handle Integer Overflow