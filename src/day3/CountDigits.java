package day3;
import java.util.Scanner;

public class CountDigits {

    static int countDigits(int number) {

        int count = 0;

        if (number ==0) return 1;

        while(number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = sc.nextInt();

        System.out.printf("Number of digits = %d", countDigits(num));
    }
}
