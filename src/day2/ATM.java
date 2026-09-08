package day2;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM");

        boolean running = true;
        int balance = 5000;

        while (running) {

            System.out.println("Select the transaction\n1.Check Balance\n2.Deposit Money\n3.Withdraw Money\n4.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> System.out.println("Current balance: " + balance);

                case 2 -> {
                    System.out.print("Enter the amount that you want to deposit: ");

                    int deposit = sc.nextInt();

                    if (deposit < 1) {
                        System.out.println("Please enter a valid amount.");
                    } else {
                        balance += deposit;
                        System.out.println("Current balance: " + balance);
                    }
                }

                case 3 -> {
                    System.out.print("Enter the amount you want to withdraw: ");

                    int withdraw = sc.nextInt();

                    if (withdraw < 1) {
                        System.out.println("Please enter a valid amount");
                    } else if (withdraw > balance) {
                        System.out.println("Sorry! There is not sufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Current balance: " + balance);
                    }
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    running = false;
                }
                default -> System.out.println("Invalid Choice. Please Try again.");
            }
        }

        sc.close();
    }
}
