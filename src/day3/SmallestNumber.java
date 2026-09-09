package day3;

import java.util.Scanner;

public class SmallestNumber {

    static int findMin(int a, int b, int c) {

        if (a < b && a < c) return a;

        if (b<c) return b;

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");

        int num1 = sc.nextInt();

        System.out.print("Enter num 2: ");

        int num2 = sc.nextInt();

        System.out.print("Enter num 3: ");

        int num3 = sc.nextInt();

        System.out.println("Smallest number is " + findMin(num1, num2, num3));

        sc.close();
    }
}
