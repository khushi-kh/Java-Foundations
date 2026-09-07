package day1;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to reverse");

        int number = sc.nextInt();

        int result = 0;

        while (number != 0) {

            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }

        System.out.println(result);
        sc.close();
    }
}

// TODO: Handle Integer Overflow