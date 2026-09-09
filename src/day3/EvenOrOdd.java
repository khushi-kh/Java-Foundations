package day3;
import java.util.Scanner;

public class EvenOrOdd {

    void evenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.printf("%d is even.", number);
        } else {
            System.out.printf("%d is odd.", number);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        EvenOrOdd obj = new EvenOrOdd();

        obj.evenOrOdd(number);

        sc.close();
    }
}
