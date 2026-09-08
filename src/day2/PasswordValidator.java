package day2;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "Password123!";
        boolean access = false;
        int attempts = 0;

        do {
           System.out.print("Enter your Password: ");

           String password = sc.nextLine();

           attempts++;

           if (correctPassword.equals(password)) {
               System.out.println("Access Granted");
               System.out.println("Number of attempts: " + attempts);
               access = true;
           } else {
               System.out.println("Wrong Password. Try Again");
           }


        }while (!access);

        sc.close();
    }
}
