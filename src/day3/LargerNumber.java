package day3;
import java.util.Scanner;

public class LargerNumber {

    int largerNumber(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");

        int num2 = sc.nextInt();

        LargerNumber obj = new LargerNumber();

        int result = obj.largerNumber(num1, num2);

        System.out.printf("%d is the larger number.", result);

        sc.close();
    }
}
