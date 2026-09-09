package day3;

import java.util.Scanner;

public class PasswordValidator {

    static boolean hasMinLength(String password) {

        return password.length() >= 8;
    }

    static boolean containsDigit(String password) {

        return password.matches(".*\\d+.*");
    }

    static boolean isValidPassword(String password) {

        return hasMinLength(password)  && containsDigit(password);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");

        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
