package day2;
import java.util.Scanner;

public class DivisibleByThreeOrFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();
        int count = 0;

        for (int i=1; i<=number; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count: " + count);

        sc.close();
    }
}

