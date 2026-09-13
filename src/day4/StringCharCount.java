package day4;

import java.util.Scanner;

public class StringCharCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");

        String str = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        for (int i=0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (ch >= '0' && ch <='9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        sc.close();

    }
}
