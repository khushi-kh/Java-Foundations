package day1;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");

        int num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.printf("%d is Even", num);
        }
        else {
            System.out.printf("%d is Odd", num);
        }

        sc.close();
    }
}
