package day2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms you want in fibonacci: ");

        int number = sc.nextInt();
        int f0 = 0;
        int f1 = 1;

        if (number <= 0) {
            System.out.println("Number of terms must be positive");
        }
        else {
            if (number == 1) {
                System.out.println(f0);
            }
            else {
                System.out.println(f0);
                System.out.println(f1);

                for (int i=2; i <number; i++) {

                    int temp = f0 + f1;
                    f0 = f1;
                    f1 = temp;

                    System.out.println(f1);
                }
            }
        }
        sc.close();
    }
}
