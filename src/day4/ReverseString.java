package day4;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        StringBuilder reversedStr = new StringBuilder(str.length());

        for (int i=str.length()-1; i>=0; i--) {

            reversedStr.append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);

        sc.close();
    }
}
