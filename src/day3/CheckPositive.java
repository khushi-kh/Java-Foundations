package day3;
import java.util.Scanner;

public class CheckPositive {

    boolean checkPositive(int num) {

        return num > 0;
    }

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        CheckPositive obj = new CheckPositive();

        if (number == 0) {
            System.out.println("Number is zero");
        } else {

            if (obj.checkPositive(number)) {
                System.out.println("Number is positive");
            } else {
                System.out.println("Number is negative");
            }
        }

        sc.close();
    }
}
